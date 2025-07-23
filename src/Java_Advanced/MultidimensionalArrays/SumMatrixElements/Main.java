package Java_Advanced.MultidimensionalArrays.SumMatrixElements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sizes=scanner.nextLine();
        int rows=Integer.parseInt(sizes.split(", ")[0]);
        int cols=Integer.parseInt(sizes.split(", ")[1]);
        int [][] matrix=new int[rows][];
        for (int row = 0; row <rows; row++) {
            int[] elements= Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row]=elements;
        }
        int sum=0;
        for (int row=0;row<rows;row++) {
            for (int col=0;col<cols;col++) {
                sum+=matrix[row][col];
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
}
