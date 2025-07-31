package Java_Fundamentals.ObjectsandClasses.TeamWorkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Team> teams = new ArrayList<>();
        Set<String> users = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] creators = scanner.nextLine().split("-");
            String user = creators[0];
            String teamName = creators[1];

            boolean teamExist = teams.stream().anyMatch(t -> t.getName().equals(teamName));
            boolean userExist = teams.stream().anyMatch(t -> t.getCreator().equals(user));

            if (teamExist) {
                System.out.println("Team " + teamName + " was already created!");
            } else if (userExist) {
                System.out.println(user + " cannot create another team!");
            } else {
                Team team = new Team(teamName, user);
                teams.add(team);
                users.add(user);
                System.out.printf("Team %s has been created by %s!%n", teamName, user);
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end of assignment")) {
            String[] parts = command.split("->");
            String user = parts[0];
            String teamToJoin = parts[1];

            Team team = teams.stream().filter(t -> t.getName().equals(teamToJoin)).findFirst().orElse(null);

            boolean isAlreadyInTeam = teams.stream()
                    .anyMatch(t -> t.getCreator().equals(user) || t.getMembers().contains(user));

            if (team == null) {
                System.out.printf("Team %s does not exist!%n", teamToJoin);
            } else if (isAlreadyInTeam) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamToJoin);
            } else {
                team.getMembers().add(user);
                users.add(user);
            }

            command = scanner.nextLine();
        }

        List<Team> validTeams = new ArrayList<>(teams);
        validTeams.removeIf(t -> t.getMembers().isEmpty());

        validTeams.sort((t1, t2) -> {
            int cmp = Integer.compare(t2.getMembers().size(), t1.getMembers().size());
            if (cmp == 0) {
                cmp = t1.getName().compareTo(t2.getName());
            }
            return cmp;
        });

        for (Team team : validTeams) {
            System.out.println(team.getName());
            System.out.printf("- %s%n", team.getCreator());
            team.getMembers().stream()
                    .sorted()
                    .forEach(m -> System.out.printf("-- %s%n", m));
        }

        // Disbanded teams
        System.out.println("Teams to disband:");
        teams.stream()
                .filter(t -> t.getMembers().isEmpty())
                .map(t -> t.getName())
                .sorted()
                .forEach(System.out::println);
    }
}
