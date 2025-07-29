package Java_Advanced.FunctionalProgramming.AppliedArithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                        Function<List<Integer>, List<Integer>> addOne =
                                list -> list.stream().map(n->n+1).collect(Collectors.toList());
                    numbers=addOne.apply(numbers);
                    break;
                case "multiply":
                    Function<List<Integer>,List<Integer>> multiply=list -> list.stream().map(n->n*2).collect(Collectors.toList());
                    numbers=multiply.apply(numbers);
                    //List<Integer> newList=new ArrayList<>();
                    //for (int num : numbers) {
                    //    newList.add(num*2);
                    //}
                    //numbers=newList;
                    break;
                case "subtract":
                   Function<List<Integer>,List<Integer>> subtract=
                           list -> list.stream().map(n->n-1).collect(Collectors.toList());
                   numbers=subtract.apply(numbers);
                    break;
                case "print":
                    Consumer<List<Integer>> print =
                            arr -> {
                                for (int num : arr) {
                                    System.out.print(num + " ");
                                }

                            };
                    print.accept(numbers);
                    //numbers.forEach(n-> System.out.print(n+" "));
                    //System.out.println();

                    break;
            }
            command = scanner.nextLine();
        }
    }
}
