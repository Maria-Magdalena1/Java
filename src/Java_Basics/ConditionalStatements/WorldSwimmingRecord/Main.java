package Java_Basics.ConditionalStatements.WorldSwimmingRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsFor1Meter = Double.parseDouble(scanner.nextLine());

        double seconds = meters * secondsFor1Meter;
        double addSeconds = Math.floor((meters / 15) * 12.5);
        double allSeconds = seconds + addSeconds;
        if (record > allSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allSeconds);
        } else {
            System.out.printf("No, he failedd! He was %.2f seconds slower.", Math.abs(record - allSeconds));
        }
    }
}
