package Java_Basics.Exams.Exam1;

import java.util.Scanner;

public class Ex5TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int points=0;
        int countWins=0;
        for (int i = 0; i < countTournaments; i++) {
            String position = scanner.nextLine();
            switch (position) {
                case "W":
                    points+=2000;
                    countWins++;
                    break;
                case "F":
                    points+=1200;
                    break;
                case "SF":
                    points+=720;
                    break;
            }
        }
        int totalPoints=startingPoints+points;
        double average=(countWins*1.0/countTournaments)*100;
        System.out.printf("Final points: %d%n",totalPoints);
        System.out.printf("Average points: %.0f%n",points/(countTournaments*1.0));
        System.out.printf("%.2f%%",average);
    }
}
