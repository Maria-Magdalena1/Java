package Java_Basics.WhileLoop.Dishwasher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDetergent = Integer.parseInt(scanner.nextLine());
        int liters = countDetergent * 750;
        String input = scanner.nextLine();

        int countDishes = 0;
        int countPots = 0;
        int times = 1;
        while (!input.equals("End")) {
            int count = Integer.parseInt(input);
            if (times % 3 == 0) {
                liters -= count * 15;
                countPots += count;
            } else {
                liters -= count * 5;
                countDishes += count;
            }
            if (liters < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(liters));
                break;
            }
            times++;

            input = scanner.nextLine();
        }

        if (liters >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed./n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.", liters);
        }
    }
}
