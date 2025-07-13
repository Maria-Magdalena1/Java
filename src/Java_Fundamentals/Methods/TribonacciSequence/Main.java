package Java_Fundamentals.Methods.TribonacciSequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTribonacci(n);


    }

    private static void printTribonacci(int number) {
        long[] tribonacci = new long[number];
        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 2;
        for (int i = 3; i < number; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        for (long numbers : tribonacci) {
            System.out.print(numbers + " ");
        }
    }
}
