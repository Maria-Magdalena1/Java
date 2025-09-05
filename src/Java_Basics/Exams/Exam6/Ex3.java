package Java_Basics.Exams.Exam6;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionName = scanner.nextLine();
        String packet = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        int price = 0;
        switch (projectionName) {
            case "John Wick":
                if (packet.equals("Drink")) {
                    price = 12;
                } else if (packet.equals("Popcorn")) {
                    price = 15;
                } else if (packet.equals("Menu")) {
                    price = 19;
                }
                break;
            case "Star Wars":
                if (packet.equals("Drink")) {
                    price = 18;
                } else if (packet.equals("Popcorn")) {
                    price = 25;
                } else if (packet.equals("Menu")) {
                    price = 30;
                }
                break;
            case "Jumanji":
                if (packet.equals("Drink")) {
                    price = 9;
                } else if (packet.equals("Popcorn")) {
                    price = 11;
                } else if (packet.equals("Menu")) {
                    price = 14;
                }
                break;

        }

        double totalPrice=price*tickets;
        if (projectionName.equals("Star Wars")&&tickets>=4) {
            totalPrice-=totalPrice*0.30;
        } else if (projectionName.equals("Jumanji")&&tickets==2) {
            totalPrice-=totalPrice*0.15;
        }

        System.out.printf("Your bill is %.2f leva.",totalPrice);
    }
}
