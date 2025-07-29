package Java_Advanced.FunctionalProgramming.SumNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //List<Integer> numbers= Arrays.stream(scanner.nextLine().split(", "))
        //        .map(Integer::parseInt)
        //        .collect(Collectors.toList());
        String[] numbers= scanner.nextLine().split(", ");
        if (numbers.length<2) {
            System.out.println("Count = "+numbers.length);
            System.out.println("Sum = "+numbers[0]);
        } else {
            Function<String,Integer> parser=x->Integer.parseInt(x);
            int sum=0;
            for (String s:numbers) {
                sum+=parser.apply(s);
            }

            System.out.println("Count = "+numbers.length);
            System.out.println("Sum = "+sum);
        }

    }
}
