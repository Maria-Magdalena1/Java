package Java_Fundamentals.Exams.FinalExams.Exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();

        String regex = "([@#])([A-Za-z]{3,})\\1\\1([A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> mirrorWords=new ArrayList<>();
        int pairCount=0;

        while (matcher.find()) {
            pairCount++;
            String wordOne=matcher.group(2);
            String wordTwo=matcher.group(3);

            StringBuilder reversed=new StringBuilder(wordTwo).reverse();
            if (wordOne.equals(reversed.toString())) {
                mirrorWords.add(wordOne+ " <=> " + wordTwo);
            }
        }

        if (pairCount==0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n",pairCount);
        }

        if (mirrorWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }
    }
}
