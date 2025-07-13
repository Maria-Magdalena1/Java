package Java_Fundamentals.DataTypesandVariables.DecryptingMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 1; i <= n; i++) {
            char letter = scanner.nextLine().charAt(0);
            char newLetter = (char) (letter + key);
            message += newLetter;
        }
        System.out.printf("%s", message);
    }
}
