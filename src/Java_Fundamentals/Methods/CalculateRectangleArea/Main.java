package Java_Fundamentals.Methods.CalculateRectangleArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Integer.parseInt(scanner.nextLine());
        double length = Integer.parseInt(scanner.nextLine());
        double area = rectangleArea(width, length);
        System.out.println(area);
    }

    private static double rectangleArea(double width, double length) {
        return width * length;
    }
}
