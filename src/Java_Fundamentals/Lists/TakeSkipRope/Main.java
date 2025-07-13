package Java_Fundamentals.Lists.TakeSkipRope;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Integer> numbersList = new ArrayList<>();
        List<Character> nonNumbersList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                numbersList.add(Character.getNumericValue(text.charAt(i)));
            } else {
                nonNumbersList.add(text.charAt(i));
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 1; i <= numbersList.size(); i++) {
            int number = numbersList.get(i - 1);
            if (i % 2 == 0) {
                skipList.add(number);
            } else {
                takeList.add(number);
            }
        }

        String decryptedText = "";
        int currentIndex = 0;
        for (int i = 0; i < takeList.size(); i++) {
            int numbersToTake = takeList.get(i);
            int numbersToSkip = skipList.size() > i ? skipList.get(i) : 0;
            for (int j = 0; j < numbersToTake && currentIndex < nonNumbersList.size(); j++) {
                decryptedText += nonNumbersList.get(currentIndex);
                currentIndex++;
            }


            currentIndex += numbersToSkip;
        }
        System.out.println(decryptedText);
    }
}
