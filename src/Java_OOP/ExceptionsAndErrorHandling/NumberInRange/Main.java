package Java_OOP.ExceptionsAndErrorHandling.NumberInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split(" ");
        int min = Integer.parseInt(range[0]);
        int max = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]%n", min, max);

        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= min && number <= max) {
                    System.out.printf("Valid number: %d%n", number);
                    break;
                }else {
                    System.out.printf("Invalid number: %d%n", number);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number: " + input);
            }
        }
    }
}
