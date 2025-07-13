package Java_Fundamentals.Methods.MiddleCharacters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacters(input);

    }

    private static void printMiddleCharacters(String input) {
        int length = input.length();
        if (length % 2 == 0) {
            for (int i = length / 2 - 1; i <= length / 2; i++) {
                System.out.print(input.charAt(i));
            }
        } else {
            System.out.println(input.charAt(length / 2));
        }
    }
}
