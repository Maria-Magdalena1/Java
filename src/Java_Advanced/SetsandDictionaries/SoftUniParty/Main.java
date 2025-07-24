package Java_Advanced.SetsandDictionaries.SoftUniParty;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();
        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vip.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        while (!input.equals("END")) {
            vip.remove(input);
            regular.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
