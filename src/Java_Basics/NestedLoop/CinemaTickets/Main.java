package Java_Basics.NestedLoop.CinemaTickets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int studentsTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        while (!input.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            int count = 0;
            while (!type.equals("End")) {
                if (type.equals("student")) {
                    studentsTickets++;
                } else if (type.equals("standard")) {
                    standardTickets++;
                } else if (type.equals("kid")) {
                    kidTickets++;
                }
                count++;
                if (count == seats) {
                    break;
                }

                type = scanner.nextLine();
            }
            double percent = (count * 1.0 / seats) * 100;
            System.out.printf("%s - %.2f full.%n", input, percent);
            input = scanner.nextLine();
        }
        int total = studentsTickets + standardTickets + kidTickets;
        System.out.printf("Total tickets: %d%n", total);
        System.out.printf("%.2f student tickets.%n", (studentsTickets * 1.0 / total) * 100);
        System.out.printf("%.2f standard tickets.%n", (standardTickets * 1.0 / total) * 100);
        System.out.printf("%.2f kids tickets.%n", (kidTickets * 1.0 / total) * 100);
    }
}
