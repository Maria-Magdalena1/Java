package Java_Fundamentals.Arrays.PascalTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n; row++) {
            int value = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }

    }
}
