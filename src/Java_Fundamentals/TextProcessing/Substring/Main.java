package Java_Fundamentals.TextProcessing.Substring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstString=scanner.nextLine();
        String secondString =scanner.nextLine();
        while (secondString.contains(firstString)) {
            secondString=secondString.replace(firstString,"");
        }
        System.out.println(secondString);
    }
}
