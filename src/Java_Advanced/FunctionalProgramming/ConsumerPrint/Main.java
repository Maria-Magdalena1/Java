package Java_Advanced.FunctionalProgramming.ConsumerPrint;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> input= Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        for (String n:input) {
            Consumer<String> print=
                    name-> System.out.println(name);
            print.accept(n);
        }
    }
}
