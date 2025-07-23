package Java_Advanced.MultidimensionalArrays.FindTheRealQueen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][]matrix=new char[8][8];
        fillMatrix(matrix,scanner);
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[0].length;col++) {
                if (matrix[row][col]=='q') {
                   boolean isUpPrimaryDiagonal=isUpPrimaryDiagonal(matrix,row-1,col-1);
                    boolean isDownPrimaryDiagonal=isDownPrimaryDiagonal(matrix,row + 1 ,col + 1);
                    boolean isUpSecondaryDiagonal=isUpSecondaryDiagonal(matrix,row - 1 ,col + 1);
                    boolean isDownSecondaryDiagonal=isDownSecondaryDiagonal(matrix,row + 1 ,col - 1);
                    boolean clear =isRowClear(matrix,row);
                    boolean cl =isColClear(matrix,col);
                    boolean isfound = isUpPrimaryDiagonal && isDownPrimaryDiagonal
                            &&isUpSecondaryDiagonal&& isDownSecondaryDiagonal
                            && clear && cl;
                    if (isfound)
                    {
                        System.out.println(row + " " + col);
                        return;
                    }
                }
            }
        }
    }
    private static boolean isColClear(char[][] matrix, int col) {
        int countqueen =0;
        for (int row = 0; row <matrix.length; row++)
        {
            if(matrix[row][col]== 'q')
            {
                countqueen++;
            }
        }
        return countqueen==1;
    }

    private static boolean isRowClear(char[][] matrix, int row) {
        int countqueen =0;
        for (int col = 0; col <matrix.length; col++)
        {
            if(matrix[row][col]== 'q')
            {
                countqueen++;
            }
        }
        return countqueen==1;
    }

    private static boolean isDownSecondaryDiagonal(char[][] matrix, int row, int col) {
        while(row<=7 && col>=0)
        {
            if(matrix[row][col]== 'q')
            {
                return false;
            }
            row++;
            col--;
        }
        return true;
    }

    private static boolean isUpSecondaryDiagonal(char[][] matrix, int row, int col) {
        while(row>=0 && col<=7)
        {
            if(matrix[row][col]== 'q')
            {
                return false;
            }
            row--;
            col++;
        }
        return true;

    }

    private static boolean isDownPrimaryDiagonal(char[][] matrix, int row, int col) {
        while (row<=7&& col<=7)
        {
            if(matrix[row][col]== 'q')
            {
                return false;
            }
            row++;
            col++;
        }
        return true;
    }
    private static boolean isUpPrimaryDiagonal(char[][] matrix, int row, int col) {
        while (row>=0&&col>=0) {
            if (matrix[row][col]=='q') {
                return false;
            }
            row--;
            col--;
        }
        return true;
    }

    private static void fillMatrix(char[][] matrix, Scanner scanner) {
        for (int row=0;row<matrix.length;row++) {
            matrix[row]=scanner.nextLine().replace(" ","").toCharArray();
        }
    }
}
