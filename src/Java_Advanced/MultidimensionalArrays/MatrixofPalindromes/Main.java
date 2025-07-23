package Java_Advanced.MultidimensionalArrays.MatrixofPalindromes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int rows= Integer.parseInt(input.split("\\s+")[0]);
        int cols=Integer.parseInt(input.split("\\s+")[1]);
        String [][] matrix= new String[rows][cols];
        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][]matrix) {
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[row].length;col++) {
                char char1=(char) (97+row);
                char char2=(char) (97+row+col);
                String stringToFill=new StringBuilder().append(char1).append(char2)
                        .append(char1).toString();
                matrix[row][col]=stringToFill;
            }
        }
    }

    private static void printMatrix(String [][] matrix)
    {
        for(int row =0;row<matrix.length;row++)
        {
            for (int col=0;col<matrix[row].length;col++)
            {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
