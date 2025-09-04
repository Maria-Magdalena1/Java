package Java_Basics.Exams.Exam2;

import java.util.Scanner;

public class Ex6BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nameOfTheTournament=scanner.nextLine();
        int countMatchesWon=0;
        int countMatchesLost=0;
        while (!nameOfTheTournament.equals("End of tournaments")) {
            int countMatches=Integer.parseInt(scanner.nextLine());
            for (int i=1;i<=countMatches;i++) {
                int pointsHomeTeam=Integer.parseInt(scanner.nextLine());
                int pointsOpponentTeam=Integer.parseInt(scanner.nextLine());
                if (pointsHomeTeam>pointsOpponentTeam) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",
                            i,nameOfTheTournament,pointsHomeTeam-pointsOpponentTeam);
                    countMatchesWon++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",
                            i,nameOfTheTournament,pointsOpponentTeam-pointsHomeTeam);
                    countMatchesLost++;
                }
            }
            nameOfTheTournament=scanner.nextLine();
        }
        int totalMatches=countMatchesWon+countMatchesLost;
        System.out.printf("%.2f%% matches win%n",(countMatchesWon*1.0/totalMatches)*100);
        System.out.printf("%.2f%% matches lost%n",(countMatchesLost*1.0/totalMatches)*100);

    }
}
