package Java_Basics.Exams.Exam3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rent=Integer.parseInt(scanner.nextLine());
        double priceForStatues=rent-rent*0.30;
        double priceForCatering=priceForStatues-priceForStatues*0.15;
        double music=priceForCatering/2;
        double totalSum=rent+priceForStatues+priceForCatering+music;
        System.out.printf("%.2f",totalSum);
    }
}
