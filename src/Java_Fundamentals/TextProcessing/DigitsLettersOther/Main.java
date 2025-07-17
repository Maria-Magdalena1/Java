package Java_Fundamentals.TextProcessing.DigitsLettersOther;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String digits="";
        String letters="";
        String chars="";
        for (int i=0;i<text.length();i++) {
            char currentChar=text.charAt(i);
            if (Character.isDigit(currentChar)) {
                letters+=currentChar;
            } else if (Character.isLetter(currentChar)) {
                digits+=currentChar;
            } else {
                chars+=currentChar;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(chars);
    }
}
