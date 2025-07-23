package Java_Advanced.MultidimensionalArrays.WrongMeasurements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = elements;
        }

        String wrongValues = scanner.nextLine();
        int wrongValueRow = Integer.parseInt(wrongValues.split("\\s+")[0]);
        int wrongValueCol = Integer.parseInt(wrongValues.split("\\s+")[1]);
        int wrongValue = matrix[wrongValueRow][wrongValueCol];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    int sum = 0;
                    //up
                    if (row > 0 && matrix[row - 1][col] != wrongValue) {
                        sum += matrix[row - 1][col];
                    }

                    //down
                    if (row < rows - 1 && col < matrix[row + 1].length && matrix[row + 1][col] != wrongValue) {
                        sum += matrix[row + 1][col];
                    }

                    //left

                    if (col > 0 && matrix[row][col - 1] != wrongValue) {
                        sum += matrix[row][col - 1];
                    }

                    //right

                    if (col < matrix[row].length - 1 && matrix[row][col + 1] != wrongValue) {
                        sum += matrix[row][col + 1];
                    }
                    matrix[row][col] = sum;
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}

