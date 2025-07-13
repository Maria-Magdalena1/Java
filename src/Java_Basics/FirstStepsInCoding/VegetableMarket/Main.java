package Java_Basics.FirstStepsInCoding.VegetableMarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForVegetables = Double.parseDouble(scanner.nextLine());
        double priceForFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double sum = priceForVegetables * kgVegetables + priceForFruits * kgFruits;
        double totalInEuro = sum / 1.94;
        System.out.printf("%.2f", totalInEuro);
    }
}
