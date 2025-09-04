package Java_Basics.Exams.Exam1;

import java.util.Scanner;

public class Ex1TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double priceForTennisRacket=Double.parseDouble(scanner.nextLine());
        int countTennisRackets=Integer.parseInt(scanner.nextLine());
        int countShoes=Integer.parseInt(scanner.nextLine());

        double priceForShoes=priceForTennisRacket/6;
        double sum=priceForTennisRacket*countTennisRackets+priceForShoes*countShoes;
        double total=sum+sum*0.20;

        double pricePaidByDjokovic=total/8;
        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(pricePaidByDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(total-pricePaidByDjokovic));
    }
}
