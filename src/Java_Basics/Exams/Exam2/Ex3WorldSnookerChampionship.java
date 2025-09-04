package Java_Basics.Exams.Exam2;

import java.util.Scanner;

public class Ex3WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        char photoOfTheTrophy = scanner.nextLine().charAt(0);
        double priceOfTicket = 0;

        switch (stage) {
            case "Quarter final":
                if (typeOfTicket.equals("Standard")) {
                    priceOfTicket = 55.50;
                } else if (typeOfTicket.equals("Premium")) {
                    priceOfTicket = 105.20;
                } else if (typeOfTicket.equals("VIP")) {
                    priceOfTicket = 118.90;
                }
                break;
            case "Semi final":
                if (typeOfTicket.equals("Standard")) {
                    priceOfTicket = 75.88;
                } else if (typeOfTicket.equals("Premium")) {
                    priceOfTicket = 125.22;
                } else if (typeOfTicket.equals("VIP")) {
                    priceOfTicket = 300.40;
                }
                break;
            case "Final":
                if (typeOfTicket.equals("Standard")) {
                    priceOfTicket = 110.10;
                } else if (typeOfTicket.equals("Premium")) {
                    priceOfTicket = 160.66;
                } else if (typeOfTicket.equals("VIP")) {
                    priceOfTicket = 400;
                }
                break;
        }
        double sum = priceOfTicket * countTickets;
        if (sum>4000) {
            sum-=sum*0.25;
            photoOfTheTrophy='N';
        } else if (sum>2500) {
            sum-=sum*0.10;
        }

        if (photoOfTheTrophy == 'Y') {
            sum+=countTickets*40;
        }

        System.out.printf("%.2f",sum);
    }
}

