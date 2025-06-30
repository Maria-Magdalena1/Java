package Java_Basics.Rectangle_Area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side b");
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        System.out.printf("Area = %d", area);
    }
}
