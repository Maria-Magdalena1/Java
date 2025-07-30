package Java_Advanced.MultidimensionalArrays.Crossfire;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizes = scanner.nextLine();
        int rowSize = Integer.parseInt(sizes.split("\\s+")[0]);
        int colSize = Integer.parseInt(sizes.split("\\s+")[1]);
        List<List<Integer>> matrix = new ArrayList<>();
        int count = 1;
        for (int r = 0; r < rowSize; r++) {
            List<Integer> row = new ArrayList<>();
            for (int c = 0; c < colSize; c++) {
                row.add(count);
                count++;
            }
            matrix.add(row);
        }


        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int targetRow = Integer.parseInt(input.split("\\s+")[0]);
            int targetCol = Integer.parseInt(input.split("\\s+")[1]);
            int givenRadius = Integer.parseInt(input.split("\\s+")[2]);


            //vertically
            for (int row = targetRow - givenRadius; row <= targetRow + givenRadius; row++) {
                if (isInBounds(matrix,row,targetCol)) {
                    matrix.get(row).set(targetCol,null);
                }
            }

            //horizontally
            for (int col=targetCol-givenRadius;col<=targetCol+givenRadius;col++) {
                if (isInBounds(matrix,targetRow,col)) {
                    matrix.get(targetRow).set(col,null);
                }
            }

            //remove all nulls from the rows
            for (int i=0;i<matrix.size();i++) {
                matrix.set(i, matrix.get(i).stream()
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList()));
            }

            //remove empty rows
            matrix.removeIf(List::isEmpty);

            input = scanner.nextLine();
        }
        for (List<Integer> row : matrix) {
            System.out.println(row.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        }
    }

    private static boolean isInBounds(List<List<Integer>> matrix, int row, int col) {
        return row >= 0 && row < matrix.size()
                && col >= 0 && col < matrix.get(row).size();
    }
}
