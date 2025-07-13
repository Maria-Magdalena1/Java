package Java_Basics.ConditionalStatementsAdvanced.OperationsBetweenNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        switch (symbol) {
            case "+":
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, sum);
                }
                break;
            case "-":
                int diff = n1 - n2;
                if (diff % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, diff);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, diff);
                }
                break;
            case "/":
                double result = n1 * 1.0 / n2;
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {

                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }
                break;
            case "*":
                int result1 = n1 * n2;
                if (result1 % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, result1);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, result1);
                }
                break;
            case "%":

                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    int procent = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, procent);
                }
                break;

        }
    }
}
