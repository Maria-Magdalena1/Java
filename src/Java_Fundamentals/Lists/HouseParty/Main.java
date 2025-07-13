package Java_Fundamentals.Lists.HouseParty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestsNames = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            if (input.split(" ")[2].equals("not")) {
                if (guestsNames.contains(name)) {
                    guestsNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            } else {
                if (guestsNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestsNames.add(name);
                }
            }
        }
        for (String name : guestsNames) {
            System.out.println(name);
        }
    }
}
