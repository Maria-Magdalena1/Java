package Java_Advanced.FunctionalProgramming.AddVAT;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double> numbers= Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        UnaryOperator<Double> add=value->value*1.2;
        System.out.println("Prices with VAT:");
        for (Double str:numbers) {
            System.out.println(String.format("%1$.2f",add.apply(str)));
        }
    }
}
