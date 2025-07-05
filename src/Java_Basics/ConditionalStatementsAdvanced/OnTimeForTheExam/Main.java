package Java_Basics.ConditionalStatementsAdvanced.OnTimeForTheExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hourExam=Integer.parseInt(scanner.nextLine());
        int minuteExam=Integer.parseInt(scanner.nextLine());
        int hourOfComing=Integer.parseInt(scanner.nextLine());
        int minuteOfComing=Integer.parseInt(scanner.nextLine());

        int examTotalTime=hourExam*60+minuteExam;
        int arrivingTotalTime=hourOfComing*60+minuteOfComing;

        int diff=Math.abs(examTotalTime-arrivingTotalTime);
        if(examTotalTime>=arrivingTotalTime)
        {
            if(diff>=0&&diff<=30)
            {
                System.out.println("On time");
                System.out.printf("%d minutes before the start",diff);
            }
            else if(diff>30)
            {
                System.out.println("Early");
                if(diff<60)
                {
                    System.out.printf("%d minutes after the start",diff);
                }
                else
                {
                    int hour=diff/60;
                    int minutes=diff%60;
                    System.out.printf("%d:%02d hours after the start",hour,minutes);
                }

            }
        }
        else
        {
            System.out.println("Late");
            if(diff<60)
            {
                System.out.printf("%d minutes after the start",diff);
            }
            else
            {
                int hour=diff/60;
                int minutes=diff%60;
                System.out.printf("%d:%02d hours after the start",hour,minutes);
            }
        }
    }
}
