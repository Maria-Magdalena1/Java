package Java_Basics.Exams.Exam2;

import java.util.Scanner;

public class Ex2Skeleton {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minutesOfTheControl=Integer.parseInt(scanner.nextLine());
        int secondsOfTheControl=Integer.parseInt(scanner.nextLine());
        double distance=Double.parseDouble(scanner.nextLine());
        int secondsPer100m=Integer.parseInt(scanner.nextLine());

        double controlSeconds=minutesOfTheControl*60+secondsOfTheControl;
        double marinsTotalSeconds=(distance/100)*secondsPer100m-(distance/120)*2.5;

        if (marinsTotalSeconds<=controlSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",marinsTotalSeconds);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",marinsTotalSeconds-controlSeconds);
        }
    }
}
