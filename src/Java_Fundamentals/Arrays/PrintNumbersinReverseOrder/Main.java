package Java_Fundamentals.Arrays.PrintNumbersinReverseOrder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }

        for (int i = n - 1; i >= 0; i--) {

            System.out.print(numbers[i] + " ");
        }
    }
}
