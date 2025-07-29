package Java_Advanced.FunctionalProgramming.KnightsOfHonor;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] names=scanner.nextLine().split(" ");
        for (String name:names) {
            Consumer<String> print=
                    personsName-> System.out.println("Sir "+personsName);

            print.accept(name);
        }
    }
}
