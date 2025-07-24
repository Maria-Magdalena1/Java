package Java_Advanced.SetsandDictionaries.CitiesbyContinentandCountry;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Map<String,List<String>>> nestedMap=new LinkedHashMap<>();
        for (int i=0;i<n;i++) {
            String input=scanner.nextLine();
            String continent=input.split(" ")[0];
            String country=input.split(" ")[1];
            String cities=input.split(" ")[2];

            nestedMap.putIfAbsent(continent,new LinkedHashMap<>());
            Map<String,List<String>> countryAndCity=nestedMap.get(continent);
            countryAndCity.putIfAbsent(country,new ArrayList<>());
            countryAndCity.get(country).add(cities);
        }

        for (Map.Entry<String,Map<String,List<String>>> entry :nestedMap.entrySet()) {
            String continent=entry.getKey();
            Map<String,List<String>> countryAndCity=entry.getValue();
            System.out.printf("%s:%n",continent);
            countryAndCity.forEach((country,city)->{
                String cities=city.stream()
                        .collect(Collectors.joining(", "));
                System.out.printf("  %s -> %s%n",country,cities);
            });
        }
    }
}
