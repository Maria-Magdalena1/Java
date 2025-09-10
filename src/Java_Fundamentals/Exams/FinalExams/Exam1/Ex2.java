package Java_Fundamentals.Exams.FinalExams.Exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        String regex = "([=/])([A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> validPlaces=new ArrayList<>();
        int travelPoints=0;

        while (matcher.find()) {
            String destination = matcher.group(2);
            validPlaces.add(destination);
            travelPoints += destination.length();
        }

        System.out.println("Destinations: "+String.join(", ",validPlaces));
        System.out.println("Travel Points: "+travelPoints);
    }
}
