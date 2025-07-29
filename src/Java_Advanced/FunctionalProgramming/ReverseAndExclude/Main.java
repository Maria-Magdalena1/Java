package Java_Advanced.FunctionalProgramming.ReverseAndExclude;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbers);

        Predicate<Integer> nonDivisible=num->num%n!=0;
        //List<Integer> filtered = numbers.stream()
        //        .filter(num -> num % n != 0)
        //        .collect(Collectors.toList());
        List<Integer> result=numbers.stream()
                .filter(nonDivisible)
                .collect(Collectors.toList());
        //Predicate<Integer> remove=num->num%n==0;
        //numbers.removeIf(remove);

        for (int num:result){
            System.out.print(num+" ");
        }

    }
}
