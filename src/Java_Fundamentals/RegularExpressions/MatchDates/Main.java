package Java_Fundamentals.RegularExpressions.MatchDates;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String datesStrings=scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(datesStrings);
        while (matcher.find()) {
            String day=matcher.group("day");
            String month=matcher.group("month");
            String year=matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }
    }
}
