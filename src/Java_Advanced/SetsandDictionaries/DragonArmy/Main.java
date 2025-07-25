package Java_Advanced.SetsandDictionaries.DragonArmy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, Map<String,int[]>> dragons=new LinkedHashMap<>();
        for (int i=0;i<n;i++) {
            String [] parts=scanner.nextLine().split(" ");
            String type=parts[0];
            String name=parts[1];
            //int damage;
            //int health;
            //int armor;
            //if (parts[2].equals("null")) {
            //    damage=45;
            //}
            //if (parts[2].equals("null")) {
            //    health=250;
            //}
            //if (parts[2].equals("null")) {
            //    armor=10;
            //}

            int damage = parts[2].equals("null") ? 45 : Integer.parseInt(parts[2]);
            int health = parts[3].equals("null") ? 250 : Integer.parseInt(parts[3]);
            int armor = parts[4].equals("null") ? 10 : Integer.parseInt(parts[4]);

            dragons.putIfAbsent(type,new TreeMap<>());
            dragons.get(type).put(name,new int[]{damage,health,armor});

        }

        for (Map.Entry<String, Map<String,int[]>> entry : dragons.entrySet()) {
            String type = entry.getKey();
            Map<String, int[]> dragonStats = entry.getValue();

            double avgDamage = 0, avgHealth = 0, avgArmor = 0;
            int count = dragonStats.size();

            for (int[] stats : dragonStats.values()) {
                avgDamage += stats[0];
                avgHealth += stats[1];
                avgArmor += stats[2];
            }

            avgDamage /= count;
            avgHealth /= count;
            avgArmor /= count;

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type, avgDamage, avgHealth, avgArmor);

            for (Map.Entry<String, int[]> dragon : dragonStats.entrySet()) {
                int[] stats = dragon.getValue();
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        dragon.getKey(), stats[0], stats[1], stats[2]);
            }
        }
    }
}
