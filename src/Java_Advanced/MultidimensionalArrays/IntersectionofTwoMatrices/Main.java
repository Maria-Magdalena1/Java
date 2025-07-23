package Java_Advanced.MultidimensionalArrays.IntersectionofTwoMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mRow = Integer.parseInt(scanner.nextLine());
        int nCol = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[mRow][nCol];
        for (int row = 0; row < mRow; row++) {
            char[] currentRow = scanner.nextLine().replace(" ","").toCharArray();
            firstMatrix[row] = currentRow;
        }

        char[][] secondMatrix = new char[mRow][nCol];
        for (int row = 0; row < mRow; row++) {
            char[] currentRow = scanner.nextLine().replace(" ","").toCharArray();
            secondMatrix[row] = currentRow;
        }
        /*
        for (int row =0;row<rows;row++)
        {
            for (int col=0;col<cols;col++)
            {
                if(matrixA[row][col]==matrixB[row][col])
                {
                    System.out.print(matrixA[row][col]+" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
         */
        char [][] thirdMatrix= new char[mRow][nCol];
        for (int row = 0; row < mRow; row++) {
            for (int col = 0; col < nCol; col++) {
                if (firstMatrix[row][col]==(secondMatrix[row][col])) {
                  thirdMatrix[row][col]= firstMatrix[row][col];
                } else {
                    thirdMatrix[row][col]='*';
                }
            }
        }

        for (int row = 0; row < mRow; row++) {
            for (int col = 0; col < nCol; col++) {
                System.out.print(thirdMatrix[row][col]+" ");
            }
            System.out.println();
        }

    }
}
