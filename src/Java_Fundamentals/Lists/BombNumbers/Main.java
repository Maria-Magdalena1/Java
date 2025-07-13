package Java_Fundamentals.Lists.BombNumbers;

import java.util.ArrayList;
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
        int specialNumber = Integer.parseInt(input.split(" ")[0]);
        int power = Integer.parseInt(input.split(" ")[1]);
        List<Integer> remainingNumbers = new ArrayList<>();

        while (numbers.contains(specialNumber)) {
            int index = numbers.indexOf(specialNumber);

            int start = Math.max(0, index - power);//lqva strana
            int end = Math.min(numbers.size() - 1, index + power);//dqsna strana

            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
