package Java_Fundamentals.AssociativeArrays.WordFilter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

       Arrays.stream(words).forEach(word -> System.out.println(word));
    }
}
