package Java_Advanced.SetsandDictionaries.PeriodicTable;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> compounds = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.contains(" ")) {
                String[] elements = input.split(" ");
                compounds.addAll(List.of(elements));
            } else {
                compounds.add(input);
            }

        }
        compounds.forEach(e -> System.out.printf("%s ", e));
    }
}
