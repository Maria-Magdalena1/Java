package Java_Advanced.SetsandDictionaries.PopulationCounter;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //country city population
        Map<String, Map<String, Integer>> statistics = new LinkedHashMap<>();
        while (!input.equals("report")) {
            String city = input.split("\\|")[0];
            String country = input.split("\\|")[1];
            int population = Integer.parseInt(input.split("\\|")[2]);

            statistics.putIfAbsent(country, new LinkedHashMap<>());
            Map<String, Integer> cityAndPopulation = statistics.get(country);
            cityAndPopulation.put(city, population);

            input = scanner.nextLine();
        }

        statistics.entrySet().stream().sorted((a, b) -> {
            long total1 = a.getValue().values().stream().mapToLong(Integer::intValue).sum();
            long total2 = b.getValue().values().stream().mapToLong(Integer::intValue).sum();
            return Long.compare(total2, total1);

        }).forEach(entry -> {
            String country = entry.getKey();
            Map<String, Integer> cities = entry.getValue();
            long totalPopulation = cities.values().stream().mapToLong(Integer::intValue).sum();
            System.out.println(country + " (total population" + totalPopulation + ")");

            cities.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                    .forEach(cityEntry ->
                            System.out.println("=>" + cityEntry.getKey() + ": " + cityEntry.getValue()));
        });

    }
}
