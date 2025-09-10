package Java_Fundamentals.Exams.FinalExams.Exam5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //cityName population gold
        Map<String, City> cities = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|\\|");
            String cityName = tokens[0];
            long population = Long.parseLong(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            cities.putIfAbsent(cityName, new City(0,0));
            City city=cities.get(cityName);
            city.setPopulation(city.getPopulation()+population);
            city.setGold(city.getGold()+gold);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] parts = input.split("=>");
            String command = parts[0];
            String townName = parts[1];

            City city=cities.get(townName);
            switch (command) {
                case "Plunder":
                    long people = Long.parseLong(parts[2]);
                    int gold = Integer.parseInt(parts[3]);

                    if (city==null) {
                        input=scanner.nextLine();
                        continue;
                    }
                   city.setPopulation(city.getPopulation()-people);
                   city.setGold(city.getGold()-gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", townName, gold, people);

                    if (city.getGold()<= 0 || (Integer) city.getGold() <= 0) {
                        cities.remove(townName);
                        System.out.printf("%s has been wiped off the map!%n", townName);

                    }
                    break;
                case "Prosper":
                    int golds = Integer.parseInt(parts[2]);
                    if (golds<0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        city.setGold(city.getGold()+golds);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                golds, townName, city.getGold());
                    }
                    break;
            }
            input=scanner.nextLine();
        }

        if (cities.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            for (Map.Entry<String, City> entry : cities.entrySet()) {
                String cityName = entry.getKey();
                City city=entry.getValue();
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", cityName, city.getPopulation(), city.getGold());
            }
        }
    }
}
