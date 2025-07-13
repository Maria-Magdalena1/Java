package Java_Basics.ConditionalStatements.FlowerShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double priceForPresent = Double.parseDouble(scanner.nextLine());

        double sum = magnolii * 3.25 + zumbuli * 4 + roses * 3.50 + cactus * 8;
        double total = sum - sum * 0.05;
        double diff = Math.abs(total - priceForPresent);
        if (total >= priceForPresent) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }
    }
}
