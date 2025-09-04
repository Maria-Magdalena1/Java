package Java_Basics.Exams.Exam3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int countActors=Integer.parseInt(scanner.nextLine());
        double priceForClothes =Double.parseDouble(scanner.nextLine());

        double decor=budget*0.10;
        if (countActors>150) {
            priceForClothes -= priceForClothes *0.10;
        }

        double totalSum=countActors*priceForClothes+decor;

        if (totalSum<=budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalSum);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalSum-budget);
        }
    }
}
