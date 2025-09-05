package Java_Basics.Exams.Exam5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double flourPrice=Double.parseDouble(scanner.nextLine());
        double kgFlour=Double.parseDouble(scanner.nextLine());
        double kgSugar=Double.parseDouble(scanner.nextLine());
        int packetEggs=Integer.parseInt(scanner.nextLine());
        int packetsYeast=Integer.parseInt(scanner.nextLine());

        double priceSugar=flourPrice-flourPrice*0.25;
        double priceEggs=flourPrice+flourPrice*0.10;
        double priceYeast=priceSugar-priceSugar*0.80;

        double total=flourPrice*kgFlour+priceSugar*kgSugar+priceEggs*packetEggs+priceYeast*packetsYeast;
        System.out.printf("%.2f",total);
    }
}
