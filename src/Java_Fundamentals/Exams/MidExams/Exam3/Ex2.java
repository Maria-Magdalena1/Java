package Java_Fundamentals.Exams.MidExams.Exam3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int shots = 0;
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (outOfBounds(index, numbers.size())) {
                input = scanner.nextLine();
                continue;
            } else {
                int number = numbers.get(index);
                numbers.set(index, -1);
                shots++;

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) != -1) {
                        if (numbers.get(i) > number) {
                            numbers.set(i, numbers.get(i) - number);
                        } else {
                            numbers.set(i, numbers.get(i) + number);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.print("Shot targets: " + shots + " -> ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    public static boolean outOfBounds(int index, int lastIndex) {
        return index < 0 || index >= lastIndex;
    }
}
