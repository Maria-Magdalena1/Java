package Java_Fundamentals.Revision.TimeAfter30Minutes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentHour = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());
        int totalTime = currentHour * 60 + currentMinutes + 30;
        int newHour = totalTime / 60;
        int newMinutes = totalTime % 60;

        System.out.printf("%d:%02d", newHour, newMinutes);
    }
}
