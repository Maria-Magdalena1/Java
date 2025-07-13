package Java_Basics.ConditionalStatements.LunchBreak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTheSerial = scanner.nextLine();
        int durationOfTheEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfTheBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = durationOfTheBreak / 8.0;
        double timeForBreak = durationOfTheBreak / 4.0;
        double restOfTheTime = durationOfTheBreak - timeForLunch - timeForBreak;
        double diff = Math.ceil(Math.abs(restOfTheTime - durationOfTheEpisode));
        if (restOfTheTime >= durationOfTheEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfTheSerial, diff);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfTheSerial, diff);
        }
    }
}
