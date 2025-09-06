package Java_Basics.Exams.Exam8;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wantedProfit = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        double total = 0;
        while (!cocktailName.equals("Party!")) {
            int cocktailCount = Integer.parseInt(scanner.nextLine());
            double price = cocktailName.length();
            double sum = cocktailCount * price;
            if (sum % 2 != 0) {
                sum -= sum * 0.25;
            }

            total += sum;

            if (total >= wantedProfit) {
                System.out.println("Target acquired.");
                break;
            }
            cocktailName = scanner.nextLine();
        }

        if (total < wantedProfit) {
            System.out.printf("We need %.2f leva more.%n", wantedProfit - total);
        }
        System.out.printf("Club income - %.2f leva.", total);
    }
}
