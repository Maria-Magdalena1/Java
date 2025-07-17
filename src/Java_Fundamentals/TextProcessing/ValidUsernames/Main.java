package Java_Fundamentals.TextProcessing.ValidUsernames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] usernames =scanner.nextLine().split(", ");
        for (String username: usernames) {
            if (username.length() >= 3 && username.length() <= 16) {
                boolean isValid = true;

                for (int i = 0; i < username.length(); i++) {
                    char symbol = username.charAt(i);
                    if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    System.out.println(username);
                }
            }
        }
    }
}
