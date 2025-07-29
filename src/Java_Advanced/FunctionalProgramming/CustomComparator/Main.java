package Java_Advanced.FunctionalProgramming.CustomComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer[] numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Comparator<Integer> customComparator=(a,b)->{
            if (a%2==b%2) {
                return Integer.compare(a,b);
            } else if (a%2==0) {
                return -1;
            } else {
                return 1;
            }
        };
        Arrays.sort(numbers,customComparator);
        for (int num:numbers) {
            System.out.print(num+" ");
        }
    }
}
