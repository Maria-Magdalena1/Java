package Java_Basics.Exams.Exam1;

import java.util.Scanner;

public class Ex2FootballResults {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int wins=0;
        int losses=0;
        int draws=0;
        for (int i=0;i<3;i++) {
            String result=scanner.nextLine();
            int homeGoals=result.charAt(0)-'0';
            int awayGoals=result.charAt(2)-'0';

            if (homeGoals>awayGoals) {
                wins++;
            } else if (awayGoals>homeGoals) {
                losses++;
            } else {
                draws++;
            }
        }

        System.out.printf("Team won %d games.%n",wins);
        System.out.printf("Team lost %d games.%n",losses);
        System.out.printf("Drawn games: %d",draws);
    }
}
