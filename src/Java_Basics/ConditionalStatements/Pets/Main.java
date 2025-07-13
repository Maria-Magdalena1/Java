package Java_Basics.ConditionalStatements.Pets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double kgDog = Double.parseDouble(scanner.nextLine());
        double kgCat = Double.parseDouble(scanner.nextLine());
        double gTurtle = Double.parseDouble(scanner.nextLine());

        double eatenFood = kgDog * days + kgCat * days + (gTurtle * days) / 1000;
        double diff = Math.abs(eatenFood - leftFood);
        if (leftFood >= eatenFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
