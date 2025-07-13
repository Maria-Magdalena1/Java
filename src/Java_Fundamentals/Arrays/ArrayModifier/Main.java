package Java_Fundamentals.Arrays.ArrayModifier;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            if (command.equals("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                int currentNumber = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = currentNumber;
            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);
                numbers[index1] = numbers[index1] * numbers[index2];

            } else if (command.equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (i != numbers.length - 1) {
                System.out.print(number + ", ");
            } else {
                System.out.print(number);
            }
        }
    }
}
