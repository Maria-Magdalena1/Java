package Java_Advanced.FunctionalProgramming.CustomMinFunction;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], Integer> minValue =
                arr -> {
                    int min = arr[0];
                    for (int num : arr) {
                        if (num < min) {
                            min = num;
                        }
                    }
                    return min;
                };

        int smallest=minValue.apply(numbers);
        System.out.println(smallest);


    }
}
