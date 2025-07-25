package Java_Advanced.SetsandDictionaries.Unleashed;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //venue singer money
        Map<String, Map<String,Long>> concerts=new LinkedHashMap<>();
        String regex = "^([a-zA-Z]+(?:\\s[a-zA-Z]+){0,2}) @([a-zA-Z]+(?:\\s[a-zA-Z]+){0,2}) (\\d+) (\\d+)$";
        Pattern pattern = Pattern.compile(regex);

        String line= scanner.nextLine();
        while (!line .equals("End")) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                String singer = matcher.group(1);
                String venue = matcher.group(2);
                int price = Integer.parseInt(matcher.group(3));
                int count = Integer.parseInt(matcher.group(4));
                long total = (long) price * count;

                concerts.putIfAbsent(venue, new LinkedHashMap<>());
                Map<String, Long> singers = concerts.get(venue);
                singers.put(singer, singers.getOrDefault(singer, 0L) + total);
            }
            line=scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Long>> venueEntry : concerts.entrySet()) {
            System.out.println(venueEntry.getKey());
            Map<String, Long> singers = venueEntry.getValue();
            singers.entrySet().stream()
                    .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                    .forEach(entry -> System.out.printf("#  %s -> %d%n", entry.getKey(), entry.getValue()));
        }

    }
}
