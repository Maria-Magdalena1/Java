package Java_OOP.ExceptionsAndErrorHandling.EnterNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int start = 1;
        int end = 100;

        while (numbers.size() < 10) {
            try {
                int number = readNumber(scanner, start, end);
                numbers.add(number);
                start = number;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Number!");
            }  catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(String.join(", ",
                numbers.stream().map(String::valueOf).toArray(String[]::new)));
    }

    private static int readNumber(Scanner scanner, int start, int end) {
        String input = scanner.nextLine();
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException();
        }

        if (num <= start || num >= end) {
            throw new IllegalArgumentException(String.format("Your number is not in range %d - %d!", start, end));
        }
        return num;
    }
}
