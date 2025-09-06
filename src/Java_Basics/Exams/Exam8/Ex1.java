package Java_Basics.Exams.Exam8;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double entryFee = Double.parseDouble(scanner.nextLine());
        double sunbedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        int umbrellas = (int) Math.ceil(people / 2.0);
        int sunbeds = (int) Math.ceil(people * 0.75);

        double totalPrice = entryFee * people + umbrellas * umbrellaPrice + sunbeds * sunbedPrice;
        System.out.printf("%.2f lv.", totalPrice);

    }
}
