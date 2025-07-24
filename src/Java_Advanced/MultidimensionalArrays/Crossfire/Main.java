package Java_Advanced.MultidimensionalArrays.Crossfire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sizes=scanner.nextLine();
        int rowSize=Integer.parseInt(sizes.split("\\s+")[0]);
        int colSize=Integer.parseInt(sizes.split("\\s+")[1]);
        int [][] matrix=new int[rowSize][colSize];
        fillMatrix(matrix);
        String input=scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int givenRow=Integer.parseInt(input.split("\\s+")[0]);
            int givenCol=Integer.parseInt(input.split("\\s+")[1]);
            int givenRadius=Integer.parseInt(input.split("\\s+")[2]);
            for (int row=0;row<matrix.length;row++) {
                for (int col=0;col<matrix[0].length;col++) {

                }
            }

            input=scanner.nextLine();
        }
    }

    private static void fillMatrix(int[][] matrix) {
        int count=1;
        for (int row=0;row<matrix.length;row++) {
            for (int col=0;col<matrix[0].length;col++) {
                matrix[row][col]=count;
                count++;
            }
        }
    }
}
