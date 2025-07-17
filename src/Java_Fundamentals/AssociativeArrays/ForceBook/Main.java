package Java_Fundamentals.AssociativeArrays.ForceBook;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> teams = new LinkedHashMap<>();//side members
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

                //ako nqma side
                if (!teams.containsKey(forceSide)) {
                    teams.put(forceSide, new ArrayList<>());
                    //ako nqma user
                    List<String> users = teams.get(forceSide);
                    if (!users.contains(forceUser)) {
                        users.add(forceUser);
                    }
                }
                //ako ima side
                else {
                    //ako nqma user
                    List<String> users = teams.get(forceSide);
                    if (!users.contains(forceUser)) {
                        users.add(forceUser);
                    }
                }
            } else if (input.contains("->")) {
                String forseUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                for (List<String> team : teams.values()) {
                    team.remove(forseUser);
                }

                //2. Проверяваме дали отбора, в който трябва да отиде играча съществува.
                if (teams.containsKey(forceSide)) {
                    teams.get(forceSide).add(forseUser);
                } else {
                    teams.put(forceSide, new ArrayList<>());
                    teams.get(forceSide).add(forseUser);
                }
                System.out.printf("%s joins the %s side!%n", forseUser, forceSide);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {
            String teamName = entry.getKey();
            List<String> players = entry.getValue();

            if (!players.isEmpty()) {
                System.out.println("Side: " + teamName + ", Members: " + players.size());
                players.forEach(player -> System.out.println("! " + player));
            }
        }
    }

}
