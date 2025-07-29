package Java_Advanced.FunctionalProgramming.CountUppercaseWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        Predicate<String> checkerUpperCase=
                word->Character.isUpperCase(word.charAt(0));
        List<String> result=new ArrayList<>();
        for (String s:text) {
            if (checkerUpperCase.test(s)) {
                result.add(s);
            }
        }

        System.out.println(result.size());
        result.forEach(word-> System.out.println(word));
    }
}
