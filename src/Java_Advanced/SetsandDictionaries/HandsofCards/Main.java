package Java_Advanced.SetsandDictionaries.HandsofCards;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> players = new LinkedHashMap<>();
        Map<String, Integer> powerValues = Map.ofEntries(
                Map.entry("2", 2), Map.entry("3", 3), Map.entry("4", 4),
                Map.entry("5", 5), Map.entry("6", 6), Map.entry("7", 7),
                Map.entry("8", 8), Map.entry("9", 9), Map.entry("10", 10),
                Map.entry("J", 11), Map.entry("Q", 12), Map.entry("K", 13),
                Map.entry("A", 14)
        );

        Map<Character, Integer> typeValues = Map.of(
                'S', 4,
                'H', 3,
                'D', 2,
                'C', 1
        );

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String[] parts = input.split(": ");
            String name = parts[0];
            String[] cards = parts[1].split(", ");
            players.putIfAbsent(name,new HashSet<>());

            for (String card:cards) {
                players.get(name).add(card);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String,Set<String>> entry:players.entrySet()) {
            String person=entry.getKey();
            Set<String> cards=entry.getValue();
            int totalValue=0;
            for (String card:cards) {
                String powerStr;
                char typeCh;

                if (card.length()==3) {
                    powerStr =card.substring(0,2);
                    typeCh =card.charAt(2);
                } else {
                    powerStr =card.substring(0,1);
                    typeCh =card.charAt(1);
                }

                int power=powerValues.get(powerStr);
                int type=typeValues.get(typeCh);

                totalValue+=power*type;
            }
            System.out.printf("%s: %d%n",person,totalValue);
        }
    }
}
