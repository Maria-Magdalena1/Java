package Java_Basics.ForLoop.NumberSequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallestNumber = Integer.MAX_VALUE;
        int biggestNumber = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.printf("Max number: %d/n", biggestNumber);
        System.out.printf("Min number: %d", smallestNumber);
    }
}
