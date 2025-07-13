package Java_Fundamentals.Methods.CharactersinRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        getCharacters(ch1, ch2);
    }

    private static void getCharacters(char firstCh, char secondCh) {
        if (firstCh < secondCh) {
            for (int i = firstCh + 1; i < secondCh; i++) {
                char result = (char) i;
                System.out.print(result + " ");
            }
        } else {
            for (int i = secondCh + 1; i < firstCh; i++) {
                char result = (char) i;
                System.out.print(result + " ");
            }
        }

    }
}
