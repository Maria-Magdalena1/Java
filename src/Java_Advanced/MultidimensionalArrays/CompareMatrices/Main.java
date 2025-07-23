package Java_Advanced.MultidimensionalArrays.CompareMatrices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfFirstMatrix = scanner.nextInt();
        int columnofFirstMatrix = scanner.nextInt();
        int[][] firstMatrix = new int[rowOfFirstMatrix][columnofFirstMatrix];
        for (int row = 0; row < rowOfFirstMatrix; row++) {
            for (int col = 0; col < columnofFirstMatrix; col++) {
                firstMatrix[row][col] = scanner.nextInt();
            }
        }
        /*second way
        for (int row = 0; row< matrixA.length; row++)
        {
           String [] currentRow = scanner.nextLine().split("\\s+");
           for (int col=0;col<currentRow.length;col++)
           {
               matrixA[row][col]= Integer.parseInt(currentRow[col]);
           }
        }
         */

        /*third way
        for (int row = 0; row< matrixA.length; row++)
        {
          int [] currentRow = Arrays.stream(scanner.nextLine().split("\\s+"))
           .mapToInt(Integer::parseInt)
           .toArray();
           matrix [row] =currentRow;
        }
         */

        int rowOfSecondMatrix = scanner.nextInt();
        int columnofSecondMatrix = scanner.nextInt();
        int[][] secondMatrix = new int[rowOfSecondMatrix][columnofSecondMatrix];
        for (int row = 0; row < rowOfSecondMatrix; row++) {
            for (int col = 0; col < columnofSecondMatrix; col++) {
                secondMatrix[row][col] = scanner.nextInt();
            }
        }

        if (areEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length!=secondMatrix.length) {
            return false;
        }
        if (firstMatrix[0].length!=secondMatrix[0].length) {
            return false;
        }
        for (int row=0;row<firstMatrix.length;row++) {
            for (int col=0;col<firstMatrix[row].length;col++) {
                if (firstMatrix[row][col]!=secondMatrix[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
