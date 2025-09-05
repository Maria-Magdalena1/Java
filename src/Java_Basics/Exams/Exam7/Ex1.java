package Java_Basics.Exams.Exam7;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String movieName=scanner.nextLine();
        int days=Integer.parseInt(scanner.nextLine());
        int tickets=Integer.parseInt(scanner.nextLine());
        double pricePerTicket=Double.parseDouble(scanner.nextLine());
        int percentageForTheCinema=Integer.parseInt(scanner.nextLine());

        double money=days*tickets*pricePerTicket;
        double profit=money-money*pricePerTicket/100;
        System.out.printf("The profit from the movie %s is %.2f lv.",movieName,profit);
    }
}
