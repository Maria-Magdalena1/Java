package Java_Fundamentals.AssociativeArrays.MOBAChallenger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //ime position skill
        Map<String, Map<String, Integer>> playerPool = new HashMap<>();
        //ime tochki
        Map<String, Integer> totalPoints = new HashMap<>();

        while (!input.equals("Season end")) {
            if (input.contains("->")) {
                String playerName = input.split(" -> ")[0];
                String position = input.split(" -> ")[1];
                int skill = Integer.parseInt(input.split(" -> ")[2]);
                playerPool.putIfAbsent(playerName, new HashMap<>());
                Map<String, Integer> player = playerPool.get(playerName);
                if (player.containsKey(position)) {
                    int currentSkill = player.get(position);
                    if (currentSkill < skill) {
                        player.put(position, skill);
                        totalPoints.put(playerName, totalPoints.get(playerName) - currentSkill + skill);
                    }
                } else {
                    player.put(position, skill);
                    totalPoints.put(playerName,totalPoints.getOrDefault(playerName,0)+ skill);
                }
            } else if (input.contains(" vs ")) {
                String firstPlayer = input.split(" vs ")[0];
                String secondPlayer = input.split(" vs ")[1];
                if (playerPool.containsKey(firstPlayer) && playerPool.containsKey(secondPlayer)) {
                    Map<String, Integer> skillFirstPlayer = playerPool.get(firstPlayer);
                    Map<String, Integer> skillSecondPlayer = playerPool.get(secondPlayer);
                    if (skillFirstPlayer.size() >= skillSecondPlayer.size()) {
                        int count = 0;
                        for (Map.Entry<String, Integer> entry : skillFirstPlayer.entrySet()) {
                            String position = entry.getKey();
                            if (skillSecondPlayer.containsKey(position)) {
                                count++;
                            }
                        }
                        if (count > 0) {
                            int pointsFirstPlayer = totalPoints.get(firstPlayer);
                            int pointsSecondPlayer = totalPoints.get(secondPlayer);
                            if (pointsFirstPlayer > pointsSecondPlayer) {
                                totalPoints.remove(secondPlayer);
                                playerPool.remove(secondPlayer);
                            } else if (pointsSecondPlayer > pointsFirstPlayer) {
                                totalPoints.remove(firstPlayer);
                                playerPool.remove(firstPlayer);
                            }
                        }
                    } else {
                        int count = 0;
                        for (Map.Entry<String, Integer> entry : skillSecondPlayer.entrySet()) {
                            String position = entry.getKey();
                            if (skillFirstPlayer.containsKey(position)) {
                                count++;
                            }
                        }
                        if (count > 0) {
                            int pointsFirstPlayer = totalPoints.get(firstPlayer);
                            int pointsSecondPlayer = totalPoints.get(secondPlayer);
                            if (pointsFirstPlayer > pointsSecondPlayer) {
                                totalPoints.remove(secondPlayer);
                                playerPool.remove(secondPlayer);
                            } else if (pointsSecondPlayer > pointsFirstPlayer) {
                                totalPoints.remove(firstPlayer);
                                playerPool.remove(firstPlayer);
                            }
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        totalPoints.entrySet().stream().sorted((a,b)->{
            int cmp = b.getValue().compareTo(a.getValue());
            if (cmp == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return cmp;
        }).forEach(entry->{
            System.out.printf("%s: %d skill%n",entry.getKey(),entry.getValue());
            String name=entry.getKey();
            Map<String,Integer> positionAndPoints=playerPool.get(name);
            positionAndPoints.entrySet().stream().sorted((a,b)->{
                int cmp = b.getValue().compareTo(a.getValue());
                if (cmp == 0) {
                    return a.getKey().compareTo(b.getKey());
                }
                return cmp;
            }).forEach(e-> System.out.printf("- %s <::> %d%n",e.getKey(),e.getValue()));
        });






    }
}
