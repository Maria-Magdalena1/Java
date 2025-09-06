package Java_Basics.Exams.Exam9;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String teamName=scanner.nextLine();
        int plays=Integer.parseInt(scanner.nextLine());
        int totalPoints=0;
        if (plays==0) {
            System.out.printf("%s hasn't played any games during this season.",teamName);
            return;
        }
        int countWins=0;
        int countDraws=0;
        int countLoses=0;
        for (int i=0;i<plays;i++) {
            char result=scanner.nextLine().charAt(0);

            switch (result) {
                case 'W':
                    totalPoints+=3;
                    countWins++;
                    break;
                case 'D':
                    totalPoints+=1;
                    countDraws++;
                    break;
                case 'L':
                    countLoses++;
                    break;
            }
        }
        System.out.printf("%s has won %d points during this season%n",teamName,totalPoints);
        System.out.println("Total stats:");
        System.out.printf("## W: %d%n",countWins);
        System.out.printf("## D: %d%n",countDraws);
        System.out.printf("## L: %d%n",countLoses);
        System.out.printf("Win rate: %.2f%%",(countWins*1.0/plays)*100);
    }
}
