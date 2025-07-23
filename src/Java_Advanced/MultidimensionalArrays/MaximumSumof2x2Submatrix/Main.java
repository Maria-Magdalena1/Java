package Java_Advanced.MultidimensionalArrays.MaximumSumof2x2Submatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizes = scanner.nextLine();
        int rows = Integer.parseInt(sizes.split(", ")[0]);
        int cols = Integer.parseInt(sizes.split(", ")[1]);

        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] elements = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = elements;
        }
        int maxSum = 0;
        int startRow = 0;
        int startCol = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }
            }
        }

        for (int row=0;row<2;row++) {
            for (int col=0;col<2;col++) {
                System.out.print(matrix[startRow+row][startCol+col]+" ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
