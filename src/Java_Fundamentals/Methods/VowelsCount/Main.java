package Java_Fundamentals.Methods.VowelsCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getCountofVowels(input);
    }

    private static void getCountofVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A'
                    || input.charAt(i) == 'E' || input.charAt(i) == 'I'
                    || input.charAt(i) == 'O' || input.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
}
