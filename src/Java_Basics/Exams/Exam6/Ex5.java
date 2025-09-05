package Java_Basics.Exams.Exam6;

import java.util.Scanner;
import java.util.Set;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());

        double totalPrice=0;
        for (int i = 0; i < series; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (name) {
                case "Thrones":
                    price-=price*0.50;
                    break;
                case "Lucifer":
                    price-=price*0.40;
                    break;
                case "Protector":
                    price-=price*0.30;
                    break;
                case "TotalDrama":
                    price-=price*0.20;
                    break;
                case "Area":
                    price-=price*0.10;
                    break;

            }

            totalPrice+=price;
        }
        double diff=Math.abs(totalPrice-budget);
        if (totalPrice<=budget) {
            System.out.printf("You bought all the series and left with %.2f lv.",diff);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!",diff);
        }
    }
}
