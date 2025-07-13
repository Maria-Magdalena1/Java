package Java_Basics.ConditionalStatements.SumSeconds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        //System.out.printf("%d:%02d",minutes,seconds);
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
