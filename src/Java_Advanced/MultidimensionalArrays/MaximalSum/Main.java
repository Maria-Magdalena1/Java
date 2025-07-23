package Java_Advanced.MultidimensionalArrays.MaximalSum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizes = scanner.nextLine();
        int rowSize = Integer.parseInt(sizes.split("\\s+")[0]);
        int colSize = Integer.parseInt(sizes.split("\\s+")[1]);

        int[][] matrix = new int[rowSize][colSize];
        fillMatrix(matrix, scanner);
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row <= matrix.length - 3; row++) {
            for (int col = 0; col <= matrix[0].length-3; col++) {
                int currentSum = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        currentSum += matrix[row+i][col+j];
                    }
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println("Sum = "+maxSum);
        for (int row=0;row<3;row++) {
            for (int col=0;col<3;col++) {
                System.out.print(matrix[maxRow+row][maxCol+col]+" ");
            }
            System.out.println();
        }

    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            int[] elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = elements;
        }
    }


}
