package Java_Fundamentals.AssociativeArrays.CountRealNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numbers = new TreeMap<>();
        for (double num : nums) {
            if (!numbers.containsKey(num)) {
                numbers.put(num, 1);
            } else {
                int occurrences = numbers.get(num);
                occurrences++;
                numbers.put(num, occurrences);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
