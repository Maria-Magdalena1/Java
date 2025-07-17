package Java_Fundamentals.TextProcessing.ASCIISumator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();
        int sum = 0;
        if (firstChar > secondChar) {
            for (int j = 0; j < input.length(); j++) {
                char currentCh = input.charAt(j);
                if (currentCh > secondChar && currentCh<firstChar) {
                    sum += currentCh;
                }
            }

        } else if (secondChar > firstChar) {
            for (int j = 0; j < input.length(); j++) {
                char currentCh = input.charAt(j);
                if (currentCh > firstChar && currentCh<secondChar) {
                    sum += currentCh;
                }
            }
        }
        System.out.println(sum);
    }
}
