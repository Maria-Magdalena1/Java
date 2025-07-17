package Java_Fundamentals.TextProcessing.ExtractPersonInformation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=n;i++) {
            String text=scanner.nextLine();
            int startIndexForName =text.indexOf('@');
            int endIndexForName =text.indexOf("|");
            String name=text.substring(startIndexForName +1, endIndexForName);
            int startIndexForAge=text.indexOf("#");
            int endIndexForAge=text.indexOf("*");
            String age=text.substring(startIndexForAge+1,endIndexForAge);
            System.out.println(name+" is "+age+" years old.");
        }
    }
}
