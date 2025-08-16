package Java_OOP.Encapsulation.FootballTeamGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Team> teams=new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String command = input.split(";")[0];

                if (command.equals("Team")) {
                    String teamName = input.split(";")[1];
                    teams.putIfAbsent(teamName, new Team(teamName));
                } else if (command.equals("Add")) {
                    String teamName = input.split(";")[1];
                    String playerName = input.split(";")[2];

                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                    }
                    int endurance = Integer.parseInt(input.split(";")[3]);
                    int sprint = Integer.parseInt(input.split(";")[4]);
                    int dribble = Integer.parseInt(input.split(";")[5]);
                    int passing = Integer.parseInt(input.split(";")[6]);
                    int shooting = Integer.parseInt(input.split(";")[7]);

                    Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                    teams.get(teamName).addPlayer(player);

                } else if (command.equals("Remove")) {
                    String teamName = input.split(";")[1];
                    if (teams.containsKey(teamName)) {
                        String playerName = input.split(";")[2];
                        teams.get(teamName).removePlayer(playerName);
                    }
                } else if (command.equals("Rating")) {
                    String teamName = input.split(";")[1];
                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                    } else {
                        System.out.printf("%s - %d%n",teamName,Math.round(teams.get(teamName).getRating()));
                    }
                }
                input = scanner.nextLine();
        }
    }
}
