package Java_Advanced.MultidimensionalArrays.FillTheMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];
        int [][] matrix=new int[n][n];
        switch (pattern) {
            case "A":
                patternA(matrix);
                break;
            case "B":
                patternB(matrix);
                break;
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix.length;col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void patternB(int [][]matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            } else {
                for (int row=matrix.length-1;row>=0;row--) {
                    matrix[row][col]=startNumber;
                    startNumber++;
                }
            }
        }
    }

    public static void patternA(int [][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }
    }
}
