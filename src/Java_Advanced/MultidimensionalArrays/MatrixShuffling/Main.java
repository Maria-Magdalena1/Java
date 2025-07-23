package Java_Advanced.MultidimensionalArrays.MatrixShuffling;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sizes=scanner.nextLine();
        int rowSize=Integer.parseInt(sizes.split("\\s+")[0]);
        int colSize=Integer.parseInt(sizes.split("\\s+")[1]);
        String [][] matrix= new String[rowSize][colSize];
        fillMatrix(matrix,scanner);
        String input=scanner.nextLine();
        while (!input.equals("END")) {
            String [] parts=input.split("\\s+");
            if (parts.length==5 && parts[0].equals("swap")) {
                try {
                    int row1=Integer.parseInt(parts[1]);
                    int col1=Integer.parseInt(parts[2]);
                    int row2=Integer.parseInt(parts[3]);
                    int col2=Integer.parseInt(parts[4]);
                    if (isInBounds(row1,col1,rowSize,colSize)&&isInBounds(row2,col2,rowSize,colSize)) {
                        String temp=matrix[row1][col1];
                        matrix[row1][col1]=matrix[row2][col2];
                        matrix[row2][col2]=temp;
                        printMatrix(matrix);
                    } else {
                        System.out.println("Invalid input!");
                    }
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            input=scanner.nextLine();
        }

    }

    private static boolean isInBounds(int row, int col, int rowSize, int colSize) {
        if (row>=0 && row<rowSize&&col>=0&&col<colSize) {
            return true;
        }
        return false;
    }

    private static void printMatrix(String[][] matrix) {
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[0].length;col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row=0;row<matrix.length;row++) {
            matrix[row]= scanner.nextLine().split("\\s+");
        }
    }
}
