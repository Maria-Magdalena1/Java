package Java_Basics.ConditionalStatements.Harvest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double forWine = x * 0.40;
        double kgGrapes = forWine * y;
        double liters = kgGrapes / 2.5;
        double diff = Math.abs(liters - z);
        if (liters >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(liters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(diff / workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }
    }
}
