package Java_Basics.Exams.Exam7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int price = 0;
        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    price = 45000;
                } else if (season.equals("Summer")) {
                    price=40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    price = 17000;
                } else if (season.equals("Summer")) {
                    price=12000;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    price = 24000;
                } else if (season.equals("Summer")) {
                    price=20250;
                }
                break;
        }

        double total=price*days;
        if (destination.equals("Dubai")) {
            total-=total*0.30;
        } else if (destination.equals("Sofia")) {
            total+=total*0.25;
        }

        double diff=Math.abs(total-budget);
        if (total<=budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",diff);
        } else {
            System.out.printf("The director needs %.2f leva more!",diff);
        }
    }
}
