package Java_Advanced.MultidimensionalArrays.PositionsOf;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int rowOfMatrix = Integer.parseInt(input.split("\\s+")[0]);
        int colOfMatrix = Integer.parseInt(input.split("\\s+")[1]);
        int[][] matrix = new int[rowOfMatrix][];
        for (int row = 0; row < rowOfMatrix; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        int number = Integer.parseInt(scanner.nextLine());
        boolean isFound=false;
        for (int row = 0; row < rowOfMatrix; row++) {
            for (int col = 0; col < colOfMatrix; col++) {
                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    isFound=true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

}
