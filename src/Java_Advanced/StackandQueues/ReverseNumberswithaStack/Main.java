package Java_Advanced.StackandQueues.ReverseNumberswithaStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        for (int number : input) {
            numbersStack.push(number);
        }
        while (!numbersStack.isEmpty()) {
            System.out.print(numbersStack.pop()+" ");
        }

    }
}
