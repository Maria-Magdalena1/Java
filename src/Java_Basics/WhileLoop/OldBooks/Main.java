package Java_Basics.WhileLoop.OldBooks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        String input = scanner.nextLine();

        boolean isFound = false;
        int tries = 0;
        while (!input.equals("No More Books")) {
            if (input.equals(book)) {
                isFound = true;
                break;
            }
            tries++;
            input = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", tries);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", tries);
        }
    }
}
