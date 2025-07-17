package Java_Fundamentals.TextProcessing.ReplaceRepeatingChars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder result=new StringBuilder();
        char previousChar=input.charAt(0);
        result.append(previousChar);
        for (int i=1;i<input.length();i++) {
            char current=input.charAt(i);
            if(current!=previousChar) {
                result.append(current);
                previousChar=current;
            }
        }
        System.out.println(result);
    }
}
