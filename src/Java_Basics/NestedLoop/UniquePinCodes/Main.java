package Java_Basics.NestedLoop.UniquePinCodes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        for (int one = 1; one <= first; one++) {
            for (int two = 1; two <= second; two++) {
                for (int three = 1; three <= third; three++) {
                    if (one % 2 == 0 && three % 2 == 0 && (two == 2 || two == 3 || two == 5 || two == 7)) {
                        System.out.printf("%d%d%d%n", one, two, three);
                    }
                }
            }
        }
    }
}
