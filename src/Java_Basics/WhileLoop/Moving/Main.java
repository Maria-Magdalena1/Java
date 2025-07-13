package Java_Basics.WhileLoop.Moving;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int capacity = width * height * length;
        while (!input.equals("Done")) {
            int count = Integer.parseInt(input);
            capacity -= count;
            if (capacity <= 0) {
                int diff = Math.abs(capacity);
                System.out.printf("No more free space! You need %d Cubic meters more.", diff);
                break;
            }


            input = scanner.nextLine();
        }
        if (capacity > 0) {
            System.out.printf("%d Cubic meters left.", capacity);
        }
    }
}
