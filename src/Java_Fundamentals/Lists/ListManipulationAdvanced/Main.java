package Java_Fundamentals.Lists.ListManipulationAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            if (input.startsWith("Contains")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                isContains(numbers, number);
            } else if (input.startsWith("Print even")) {
                printEvenNumbers(numbers);
            } else if (input.startsWith("Print odd")) {
                printOddNumbers(numbers);
            } else if (input.startsWith("Get sum")) {
                printSumofTheNumbers(numbers);
            } else if (input.startsWith("Filter")) {
                String condition = input.split(" ")[1];
                int num = Integer.parseInt(input.split(" ")[2]);
                printFIlteredNumbers(numbers, condition, num);
            }

            input = scanner.nextLine();
        }
    }

    private static void printFIlteredNumbers(List<Integer> numbers, String condition, int wantedNum) {
        switch (condition) {
            case "<":
                for (int num : numbers) {
                    if (num < wantedNum) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int num : numbers) {
                    if (num > wantedNum) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int num : numbers) {
                    if (num >= wantedNum) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int num : numbers) {
                    if (num <= wantedNum) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    private static void printSumofTheNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void isContains(List<Integer> numbers, int number) {
        if (numbers.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
