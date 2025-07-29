package Java_Advanced.FunctionalProgramming.SortEvenNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n -> n % 2 != 0);
        numbers.forEach(n -> System.out.print(n + ", "));
        System.out.println();
        numbers.sort((a, b) -> a.compareTo(b));
        //numbers.sort();
        numbers.forEach(n -> System.out.print(n + ", "));
    }
}
