package Java_Advanced.MultidimensionalArrays.DiagonalDifference;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int [][] matrix=new int[n][n];
        fillMatrix(matrix,scanner);
        int primarySum=primaryDiagonal(matrix);
        int secondarySum=secondaryDiagonal(matrix);
        int difference=Math.abs(primarySum-secondarySum);
        System.out.println(difference);


    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row=0;row<matrix.length;row++) {
            int [] elements= Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row]=elements;
        }
    }

    private static void printMatrix(int [][]matrix) {
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[0].length;col++) {
                System.out.print(matrix[row][col] +" ");
            }
            System.out.println();
        }
    }

    private static int primaryDiagonal(int [][]matrix) {
        int sum=0;
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[0].length;col++) {
                if (row==col) {
                    sum+=matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int secondaryDiagonal(int [][]matrix) {
        int sum=0;
        int col=0;
        for (int row=matrix.length-1;row>=0;row--) {
           sum+=matrix[row][col];
           col++;
        }
        return sum;
    }
}
