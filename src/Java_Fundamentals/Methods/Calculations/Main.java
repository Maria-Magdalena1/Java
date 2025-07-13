package Java_Fundamentals.Methods.Calculations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(number1, number2);
                break;
            case "multiply":
                multiplication(number1, number2);
                break;
            case "subtract":
                subtraction(number1, number2);
                break;
            case "divide":
                division(number1, number2);
                break;
        }
    }

    private static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    private static void subtraction(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println(sub);
    }

    private static void multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        System.out.println(multiplication);
    }

    private static void division(int num1, int num2) {
        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println(div);
        }
    }
}
