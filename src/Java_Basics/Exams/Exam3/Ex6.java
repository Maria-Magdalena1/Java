package Java_Basics.Exams.Exam3;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!movieName.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            int countTickets = 0;

            String typeOfTicket = scanner.nextLine();
            while (!typeOfTicket.equals("End")) {
                switch (typeOfTicket) {
                    case "student":
                        countTickets++;
                        studentTickets++;
                        break;
                    case "kid":
                        countTickets++;
                        kidTickets++;
                        break;
                    case "standard":
                        countTickets++;
                        standardTickets++;
                        break;
                }
                if (countTickets>=seats) {
                    break;
                }
                typeOfTicket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, (countTickets * 1.0 / seats) * 100);

            movieName = scanner.nextLine();
        }
        int totalTickets=kidTickets + standardTickets + studentTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n",(studentTickets*1.0/totalTickets)*100);
        System.out.printf("%.2f%% standard tickets.%n",(standardTickets*1.0/totalTickets)*100);
        System.out.printf("%.2f%% kids tickets.",(kidTickets*1.0/totalTickets)*100);

    }
}
