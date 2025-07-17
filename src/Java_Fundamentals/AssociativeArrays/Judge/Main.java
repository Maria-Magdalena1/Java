package Java_Fundamentals.AssociativeArrays.Judge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String, LinkedHashMap<String,Integer>> contests=new LinkedHashMap<>();
        Map<String,Integer> totalPoints=new HashMap<>();
        while (!input.equals("no more time")) {
            String username=input.split(" -> ")[0];
            String contest=input.split(" -> ")[1];
            int points=Integer.parseInt(input.split(" -> ")[2]);
            contests.putIfAbsent(contest, new LinkedHashMap<>());
            Map<String, Integer> participants = contests.get(contest);

            if (participants.containsKey(username)) {
                int currentPoints = participants.get(username);
                if (points > currentPoints) {
                    participants.put(username, points);

                    // Update totalPoints: subtract old, add new
                    int total = totalPoints.get(username);
                    totalPoints.put(username, total - currentPoints + points);
                }
            } else {
                participants.put(username, points);
                totalPoints.put(username, points);
            }

            input=scanner.nextLine();
        }

        for (Map.Entry<String,LinkedHashMap<String,Integer>> entry :contests.entrySet()) {
            String contest=entry.getKey();
            Map<String,Integer> participants=entry.getValue();
            System.out.printf("%d: %d participants%n",contest,participants.size());

            List<Map.Entry<String, Integer>> sorted = new ArrayList<>(participants.entrySet());
            sorted.sort((e1, e2) -> {
                int comp = Integer.compare(e2.getValue(), e1.getValue());
                if (comp == 0) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return comp;
            });

            int position = 1;
            for (Map.Entry<String, Integer> e : sorted) {
                System.out.printf("%d. %s <::> %d%n", position++, e.getKey(), e.getValue());
            }
        }
        System.out.println("Individual standings:");
        List<Map.Entry<String, Integer>> sortedIndividuals = new ArrayList<>(totalPoints.entrySet());
        sortedIndividuals.sort((e1, e2) -> {
            int comp = Integer.compare(e2.getValue(), e1.getValue());
            if (comp == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return comp;
        });
    }
}
