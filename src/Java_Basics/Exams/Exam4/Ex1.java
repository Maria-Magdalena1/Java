package Java_Basics.Exams.Exam4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countPanetone=Integer.parseInt(scanner.nextLine());
        int countBoxOfEggs =Integer.parseInt(scanner.nextLine());
        int countCookies=Integer.parseInt(scanner.nextLine());

        double panetonePrice=countPanetone*3.20;
        double coloredEggsPrice= countBoxOfEggs * 4.35 +countBoxOfEggs*12*0.15;
        double cookiesPrice=countCookies*5.40;

        double total=panetonePrice+coloredEggsPrice+cookiesPrice;
        System.out.printf("%.2f",total);
    }
}
