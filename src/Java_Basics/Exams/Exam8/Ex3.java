package Java_Basics.Exams.Exam8;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfBeverage = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countBeverage = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (typeOfBeverage) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = 0.90;
                } else if (sugar.equals("Normal")) {
                    price = 1;
                } else if (sugar.equals("Extra")) {
                    price = 1.20;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = 1;
                } else if (sugar.equals("Normal")) {
                    price = 1.20;
                } else if (sugar.equals("Extra")) {
                    price = 1.60;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = 0.50;
                } else if (sugar.equals("Normal")) {
                    price = 0.60;
                } else if (sugar.equals("Extra")) {
                    price = 0.70;
                }
                break;
        }

        double sum=price*countBeverage;
        if (sugar.equals("Without")) {
            sum-=sum*0.35;
        }

        if (typeOfBeverage.equals("Espresso")&& countBeverage>=5) {
            sum-=sum*0.25;
        }

        if (sum>15) {
            sum-=sum*0.20;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.",countBeverage,typeOfBeverage,sum);
    }
}
