package Java_Basics.Exams.Exam3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countTickets = 0;
        int countProducts = 0;
        while (!input.equals("End")) {
            if (input.length() > 8) {
                int price = input.charAt(0) + input.charAt(1);
                if (money >= price) {
                    money -= price;
                    countTickets++;
                } else {
                    break;
                }
            } else {
                int price=input.charAt(0);
                if (money >= price) {
                    money -= price;
                    countProducts++;
                } else {
                    break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(countTickets);
        System.out.println(countProducts);
    }
}
