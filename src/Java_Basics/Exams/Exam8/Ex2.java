package Java_Basics.Exams.Exam8;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int nights=Integer.parseInt(scanner.nextLine());
        double pricePerNight=Double.parseDouble(scanner.nextLine());
        int additionalFees=Integer.parseInt(scanner.nextLine());

        if (nights>7) {
            pricePerNight-=pricePerNight*0.05;
        }

        double total=nights*pricePerNight+budget*additionalFees/100;
        double diff=Math.abs(total-budget);
        if (total<=budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",diff);
        } else {
            System.out.printf("%.2f leva needed.",diff);
        }
    }
}
