package Java_Advanced.FunctionalProgramming.PredicateForNames;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        String [] names=scanner.nextLine().split(" ");
        for (String personsName:names) {
            Predicate<String> namesLength=
                    name->name.length()<=length;

            if (namesLength.test(personsName)) {
                System.out.println(personsName);
            }
        }
    }
}
