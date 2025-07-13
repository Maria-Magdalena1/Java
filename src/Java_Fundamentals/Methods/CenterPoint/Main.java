package Java_Fundamentals.Methods.CenterPoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        printClosestPoint(x1, y1, x2, y2);

    }

    private static void printClosestPoint(int x1, int y1, int x2, int y2) {
        double sum1 = x1 * x1 + y1 * y1;
        double radius1 = Math.sqrt(sum1);

        double sum2 = x2 * x2 + y2 * y2;
        double radius2 = Math.sqrt(sum2);

        if (radius1 > radius2) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }

    }
}
