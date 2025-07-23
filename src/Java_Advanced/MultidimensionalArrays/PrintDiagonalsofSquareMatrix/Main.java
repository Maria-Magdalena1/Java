package Java_Advanced.MultidimensionalArrays.PrintDiagonalsofSquareMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int [][] matrix=new int[n][];
        for (int row=0;row<n;row++) {
            int [] elements= Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row]=elements;
        }
        for (int row=0;row<n;row++) {
            for (int col=0;col<n;col++) {
                if (row==col) {
                    System.out.print(matrix[row][col]+" ");
                }
            }
        }
        System.out.println();

        int col=0;
        for (int row=matrix.length-1;row>=0;row--) {
            System.out.print(matrix[row][col]+" ");
            col++;
        }


    }
}
