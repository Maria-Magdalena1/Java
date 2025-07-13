package Java_Basics.ForLoop.HalfSumElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        int sumWithoutMaxNumbers = sum - maxNumber;
        if (sumWithoutMaxNumbers == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNumbers);
        } else {
            int diff = Math.abs(sumWithoutMaxNumbers - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
