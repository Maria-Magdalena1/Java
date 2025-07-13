package Java_Basics.NestedLoop.ChallengetheWedding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMan = Integer.parseInt(scanner.nextLine());
        int countWoman = Integer.parseInt(scanner.nextLine());
        int countTables = Integer.parseInt(scanner.nextLine());
        int tables = 1;
        for (int m = 1; m <= countMan; m++) {
            for (int w = 1; w <= countWoman; w++) {
                if (tables <= countTables) {
                    System.out.printf("(%d <-> %d) ", m, w);
                    tables++;
                }
            }
        }
    }
}
