package Java_Fundamentals.TextProcessing.CaesarCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder result=new StringBuilder();
        for (int i=0;i<text.length();i++) {

            char letter= (char) (text.charAt(i)+3);
            result.append(letter);
        }
        System.out.println(result);
    }
}
