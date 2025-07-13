package Java_Fundamentals.ObjectsandClasses.RandomizeWords;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Random random = new Random();
        for (int pos = 0; pos < words.length; pos++) {
            int pos1 = random.nextInt(words.length);
            int pos2 = random.nextInt(words.length);

            String oldWord = words[pos1];
            words[pos1] = words[pos2];
            words[pos2] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
