package Java_Fundamentals.Lists.ListOperations;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];

            switch (commandName) {
                case "Add" -> {
                    int numberToAdd = Integer.parseInt(commandData[1]); // 5
                    numbers.add(numberToAdd);
                }
                case "Insert" -> {
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int index = Integer.parseInt(commandData[2]);

                    boolean isValidIndex = checkIfIndexIsValid(index, numbers.size() - 1);

                    if (isValidIndex) {
                        numbers.add(index, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }

                }

                case "Remove" -> {

                    int indexToRemove = Integer.parseInt(commandData[1]);
                    boolean isValidIndex = checkIfIndexIsValid(indexToRemove, numbers.size() - 1);

                    if (isValidIndex) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                }

                case "Shift" -> {

                    String shiftType = commandData[1];
                    int count = Integer.parseInt(commandData[2]);

                    if (shiftType.equals("left")) {
                        shiftLeft(numbers, count);
                    } else if (shiftType.equals("right")) {

                        shiftRight(numbers, count);
                    }
                }
            }


            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 1; i <= count; i++) {

            int firstElement = numbers.getFirst();
            numbers.add(firstElement); //1. {12, 10, 4, 23, 12} -> 2. {10, 4, 23, 12, 10}
            numbers.remove(0);//1. {10, 4, 23, 12} -> 2. {4, 23, 12, 10}

        }
    }


    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 1; i <= count; i++) {

            int lastElement = numbers.getLast();
            numbers.add(0, lastElement); //1. {23, 12, 10, 4, 23} -> 2. {4, 23, 12, 10, 4}
            numbers.remove(numbers.size() - 1);//1. {23, 12, 10, 4}-> 2.  {4, 23, 12, 10}

        }
    }

    private static boolean checkIfIndexIsValid(int index, int lastIndex) {

        return index >= 0 && index <= lastIndex;
    }
}
