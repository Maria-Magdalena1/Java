package Java_Basics.Exams.Exam4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countPeople=Integer.parseInt(scanner.nextLine());
        double pricePerPerson=Double.parseDouble(scanner.nextLine());
        double budget=Double.parseDouble(scanner.nextLine());

        if (countPeople>=10&&countPeople<=15) {
            pricePerPerson-=pricePerPerson*0.15;
        } else if (countPeople>15&&countPeople<=20) {
            pricePerPerson-=pricePerPerson*0.20;
        } else if (countPeople>20) {
            pricePerPerson-=25;
        }

        double cakePrice=budget*0.10;
        double total=pricePerPerson*countPeople+cakePrice;
        double diff=Math.abs(total-budget);
        if (total<=budget) {
            System.out.printf("It is party time! %.2f leva left.",diff);
        } else {
            System.out.printf("No party! %.2f leva needed.",diff);
        }
    }
}
