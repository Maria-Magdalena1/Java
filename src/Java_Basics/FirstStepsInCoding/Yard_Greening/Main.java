package Java_Basics.FirstStepsInCoding.Yard_Greening;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double space = Double.parseDouble(scanner.nextLine());
        double price = space * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %.2f lv./n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
