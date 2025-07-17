package Java_Fundamentals.TextProcessing.LettersChangeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []input=scanner.nextLine().split("\\s+");
        double sum=0;
        for (String text:input) {
            char firstLetter=text.charAt(0);
            char lastLetter=text.charAt(text.length()-1);

            double number=Double.parseDouble(text.substring(1,text.length()-1));
            int firstLetterPosition =Character.toLowerCase(firstLetter)-'a'+1;
            int secondLetterPosition =text.indexOf(lastLetter);
            if (Character.isUpperCase(firstLetter)) {
                number/= firstLetterPosition;
            } else if (Character.isLowerCase(firstLetter)) {
                number*= firstLetterPosition;
            }

            if (Character.isUpperCase(lastLetter)) {
                number-= secondLetterPosition;
            } else if (Character.isLowerCase(lastLetter)) {
                number+= secondLetterPosition;
            }
            sum+=number;
        }
        System.out.println(sum);

    }
}
