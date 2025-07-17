package Java_Fundamentals.TextProcessing.TextFilter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] banList=scanner.nextLine().split(", ");
        String text=scanner.nextLine();
        for (String word :banList) {
            while (text.contains(word)) {
                String replacement="*".repeat(word.length());
                text=text.replace(word,replacement);
            }
        }
        System.out.println(text);
    }
}
