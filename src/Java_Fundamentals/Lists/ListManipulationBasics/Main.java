package Java_Fundamentals.Lists.ListManipulationBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInteger = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String command = input.split(" ")[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(input.split(" ")[1]);
                    listInteger.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(input.split(" ")[1]);
                    listInteger.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(input.split(" ")[1]);
                    listInteger.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(input.split(" ")[1]);
                    int indexToInsert = Integer.parseInt(input.split(" ")[2]);
                    listInteger.add(indexToInsert, numberToInsert);
                    break;
            }
            input = scanner.nextLine();
        }

        for (int number : listInteger) {
            System.out.print(number + " ");
        }
    }
}
