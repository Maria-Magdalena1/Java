package Java_Basics.ConditionalStatements.Timeafter15Minutes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hour=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
        int time=hour*60 +minutes+15;
        int newHour=time/60;
        int newMinutes=time%60;
        if(newHour>23)
        {
            newHour=0;
        }

        if(newMinutes<10)
        {
            System.out.printf("%d:0%d",newHour,newMinutes);
        }
        else
        {
            System.out.printf("%d:%d",newHour,newMinutes);
        }

    }
}
