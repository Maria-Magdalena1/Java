package Java_Fundamentals.RegularExpressions.MatchPhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex="\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones=scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phones);
        List<String> matchedPhones=new ArrayList<>();
        while(matcher.find()) {
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ",matchedPhones));
    }
}
