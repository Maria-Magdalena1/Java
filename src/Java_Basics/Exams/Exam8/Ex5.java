package Java_Basics.Exams.Exam8;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int soldGames= Integer.parseInt(scanner.nextLine());
        int countHearthstone=0;
        int countFortnite=0;
        int countOvewatch=0;
        int countOthers=0;

        for (int i=0;i<soldGames;i++) {
            String gameName=scanner.nextLine();
            switch (gameName) {
                case "Hearthstone":
                    countHearthstone++;
                    break;
                case "Fortnite":
                    countFortnite++;
                    break;
                case "Overwatch":
                    countOvewatch++;
                    break;
                default:
                    countOthers++;
            }
        }
        System.out.printf("Herthstone - %.2f%n",(countHearthstone*1.0/soldGames)*100);
        System.out.printf("Fortnite - %.2f%n",(countFortnite*1.0/soldGames)*100);
        System.out.printf("Overwatch - %.2f%n",(countOvewatch*1.0/soldGames)*100);
        System.out.printf("Others - %.2f%n",(countOthers*1.0/soldGames)*100);

    }
}
