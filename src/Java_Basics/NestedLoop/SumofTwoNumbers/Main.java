package Java_Basics.NestedLoop.SumofTwoNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean found = false;
        for (int i = a; i <= b; i++) {
            for (int e = a; e <= b; e++) {
                if ((i + e) == magicNumber) {
                    found = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, e, magicNumber);
                    break;
                }
                count++;
            }
            if (found) {
                break;
            }
        }
        if (count < 0) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
