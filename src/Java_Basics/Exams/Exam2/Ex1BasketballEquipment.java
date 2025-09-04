package Java_Basics.Exams.Exam2;

import java.util.Scanner;

public class Ex1BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int yearlyExpenses=Integer.parseInt(scanner.nextLine());

        double priceShoes=yearlyExpenses-yearlyExpenses*0.4;
        double priceClothes=priceShoes-priceShoes*0.2;
        double priceBall=priceClothes/4;
        double priceAccessories=priceBall/5;

        double total=yearlyExpenses+priceShoes+priceClothes+priceBall+priceAccessories;
        System.out.printf("%.2f",total);
    }
}
