package Java_Fundamentals.AssociativeArrays.Snowwhite;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> data = new LinkedHashMap<>();
        Map<String,Integer> countHatColors=new TreeMap<>();
        while (!input.equals("Once upon a time")) {
            String dwarfName = input.split(" <:> ")[0];
            String dwarfHatColor = input.split(" <:> ")[1];
            int dwarfPhysics = Integer.parseInt(input.split(" <:> ")[2]);
            String key = dwarfName + ":" + dwarfHatColor;
            if (!data.containsKey(key) || data.get(key) < dwarfPhysics) {
                data.put(key, dwarfPhysics);
            }
            countHatColors.put(dwarfHatColor, 0);
            input = scanner.nextLine();
        }

        for (String key : data.keySet()) {
            String color = key.split(":")[1];
            countHatColors.put(color, countHatColors.get(color) + 1);
        }
        data.entrySet()
                .stream()
                .sorted((a, b) -> {
                    int physicsCompare = b.getValue().compareTo(a.getValue());
                    if (physicsCompare == 0) {
                        String colorA = a.getKey().split(":")[1];
                        String colorB = b.getKey().split(":")[1];
                        return countHatColors.get(colorB).compareTo(countHatColors.get(colorA));
                    }
                    return physicsCompare;
                })
                .forEach(entry -> {
                    String[] parts = entry.getKey().split(":");
                    String name = parts[0];
                    String color = parts[1];
                    int physics = entry.getValue();
                    System.out.printf("(%s) %s <-> %d%n", color, name, physics);
                });


    }
}
