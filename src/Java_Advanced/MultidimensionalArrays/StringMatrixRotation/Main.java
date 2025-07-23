package Java_Advanced.MultidimensionalArrays.StringMatrixRotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotationInput = scanner.nextLine();
        int degrees = Integer.parseInt(rotationInput.substring(rotationInput.indexOf('(') + 1, rotationInput.indexOf(")")));
        int rotation=(degrees%360 +360)%360;

        List<String> lines=new ArrayList<>();
        int maxLength=0;

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            lines.add(input);
            maxLength=Math.max(maxLength,input.length());
            input = scanner.nextLine();
        }

        int rows = lines.size();
        int cols = maxLength;
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = lines.get(i);
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = j < line.length() ? line.charAt(j) : ' ';
            }
        }


        switch (rotation) {
            case 0:
                printMatrix(matrix);
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            System.out.println(new String(row));
        }
    }
}
