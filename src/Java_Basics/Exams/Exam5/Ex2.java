package Java_Basics.Exams.Exam5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countGuests=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());

        int panetone= (int) Math.ceil(countGuests/3.0);
        int pricePanetone=panetone*4;

        int eggs=countGuests*2;
        double priceEggs=eggs*0.45;
        double total=pricePanetone+priceEggs;

        double diff=Math.abs(total-budget);
        if (total<=budget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n",panetone,eggs);
            System.out.printf("He has %.2f lv. left.",diff);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",diff);
        }
    }
}
