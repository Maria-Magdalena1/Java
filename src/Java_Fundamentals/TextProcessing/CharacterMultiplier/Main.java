package Java_Fundamentals.TextProcessing.CharacterMultiplier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String firstWord = words[0];
        String secondWord = words[1];
        System.out.println(sum(firstWord,secondWord));
    }

    public static int sum(String first, String second) {
        int sum = 0;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                int firstNumber = first.charAt(i);
                int secondNumber = second.charAt(i);
                sum += firstNumber * secondNumber;
            }
        } else if (first.length() > second.length()) {
            for (int i = 0; i < second.length(); i++) {
                int firstNumber = first.charAt(i);
                int secondNumber = second.charAt(i);
                sum += firstNumber * secondNumber;
            }
            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = 0; i < first.length(); i++) {
                int firstNumber = first.charAt(i);
                int secondNumber = second.charAt(i);
                sum += firstNumber * secondNumber;
            }
            for (int i = first.length(); i < second.length(); i++) {
                sum += second.charAt(i);
            }

        }
        return sum;
    }
}
