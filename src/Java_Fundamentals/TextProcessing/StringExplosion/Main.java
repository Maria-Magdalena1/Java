package Java_Fundamentals.TextProcessing.StringExplosion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder text=new StringBuilder(scanner.nextLine());
        int strength=0;
        for (int i=0;i<text.length();i++) {
            char current=text.charAt(i);
            if (current=='>') {
                int explosion=text.charAt(i+1)-'0';
                strength+=explosion;
            } else if(strength>0) {
                text.deleteCharAt(i);
                i--;
                strength--;
            }
        }
        System.out.println(text);
    }
}
