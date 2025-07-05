package Java_Basics.ConditionalStatements.SleepyTomCat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int daysOff=Integer.parseInt(scanner.nextLine());
        int workingDays=365-daysOff;
        int timeForPlay=daysOff*127 + workingDays*63;

        int time=Math.abs(30000-timeForPlay);
        int hour=time/60;
        int minutes=time%60;

        if(timeForPlay>30000)
        {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hour,minutes);
        }
        else
        {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hour,minutes);
        }

    }
}
