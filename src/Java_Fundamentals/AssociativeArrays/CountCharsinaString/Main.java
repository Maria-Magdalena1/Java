package Java_Fundamentals.AssociativeArrays.CountCharsinaString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> characters = new LinkedHashMap<>();
        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            } else {
                if (!characters.containsKey(symbol)) {
                    characters.put(symbol, 1);
                } else {
                    int occurrences = characters.get(symbol);
                    characters.put(symbol, occurrences + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
