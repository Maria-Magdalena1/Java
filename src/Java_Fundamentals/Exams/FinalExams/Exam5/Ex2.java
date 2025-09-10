package Java_Fundamentals.Exams.FinalExams.Exam5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        long coolThreshold=1;
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher = digitPattern.matcher(input);

        while (digitMatcher.find()) {
            int digit = Integer.parseInt(digitMatcher.group());
            coolThreshold *= digit;
        }

        System.out.println("Cool threshold: " + coolThreshold);

        String regex="([:*]{2})([A-Z][a-z]{2,})\\1";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        List<String> allEmojis = new ArrayList<>();
        List<String> coolEmojis = new ArrayList<>();
        while (matcher.find()) {
            String emoji = matcher.group();
            allEmojis.add(emoji);

            int coolness=0;
            String emojiText=matcher.group(2);
            for (char ch : emojiText.toCharArray()) {
                coolness += (int) ch;
            }

            if (coolness > coolThreshold) {
                coolEmojis.add(emoji);
            }
        }

        System.out.println(allEmojis.size() + " emojis found in the text. The cool ones are:");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }
    }
}
