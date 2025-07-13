package Java_Fundamentals.Methods.NxNMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
