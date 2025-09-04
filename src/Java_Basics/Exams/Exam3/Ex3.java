package Java_Basics.Exams.Exam3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String movieName=scanner.nextLine();
        String typeOfTheHall=scanner.nextLine();
        int countTickets=Integer.parseInt(scanner.nextLine());

        double priceForTicket=0;
        switch (movieName) {
            case "A Star Is Born":
                if (typeOfTheHall.equals("normal")) {
                    priceForTicket=7.50;
                } else if (typeOfTheHall.equals("luxury")) {
                    priceForTicket=10.50;
                } else if (typeOfTheHall.equals("ultra luxury")) {
                    priceForTicket=13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeOfTheHall.equals("normal")) {
                    priceForTicket=7.35;
                } else if (typeOfTheHall.equals("luxury")) {
                    priceForTicket=9.45;
                } else if (typeOfTheHall.equals("ultra luxury")) {
                    priceForTicket=12.75;
                }
                break;
            case "Green Book":
                if (typeOfTheHall.equals("normal")) {
                    priceForTicket=8.15;
                } else if (typeOfTheHall.equals("luxury")) {
                    priceForTicket=10.25;
                } else if (typeOfTheHall.equals("ultra luxury")) {
                    priceForTicket=13.25;
                }
                break;
            case "The Favourite":
                if (typeOfTheHall.equals("normal")) {
                    priceForTicket=8.75;
                } else if (typeOfTheHall.equals("luxury")) {
                    priceForTicket=11.55;
                } else if (typeOfTheHall.equals("ultra luxury")) {
                    priceForTicket=13.95;
                }
                break;
        }

        double totalSum=priceForTicket*countTickets;
        System.out.printf("%s -> %.2f",movieName,totalSum);
    }
}
