package Java_Basics.Exams.Exam7;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int photoShootTime = Integer.parseInt(scanner.nextLine());
        int stages = Integer.parseInt(scanner.nextLine());
        int durationPreStage = Integer.parseInt(scanner.nextLine());

        double preparationPerStage = photoShootTime * 0.15;
        double totalTime = stages * durationPreStage + preparationPerStage;
        double diff=Math.abs(Math.round(totalTime-photoShootTime));
        if (totalTime <= photoShootTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",diff);
        }
    }
}
