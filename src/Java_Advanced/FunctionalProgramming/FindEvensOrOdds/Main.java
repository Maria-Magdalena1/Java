package Java_Advanced.FunctionalProgramming.FindEvensOrOdds;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizes = scanner.nextLine().split(" ");
        int lower = Integer.parseInt(sizes[0]);
        int upper = Integer.parseInt(sizes[1]);
        String evenOrOdd = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (int i=lower;i<=upper;i++) {
            if (evenOrOdd.equals("odd")) {
                Predicate<Integer> inRange = number -> number % 2 != 0;
                if(inRange.test(i)) {
                    numbers.add(i);
                }
            } else {
                Predicate<Integer> inRange = number -> number % 2 == 0;
                if (inRange.test(i)) {
                    numbers.add(i);
                }
            }
        }
        numbers.forEach(n-> System.out.print(n+" "));
    }
}
