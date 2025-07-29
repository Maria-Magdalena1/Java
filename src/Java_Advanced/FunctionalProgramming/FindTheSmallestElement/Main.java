package Java_Advanced.FunctionalProgramming.FindTheSmallestElement;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], Integer> smallest =
                arr -> {
                    int min = arr[0];
                    int index = 0;
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                            index = i;
                        }
                    }
                    return index;
                };

        System.out.println(smallest.apply(numbers));
    }

}

