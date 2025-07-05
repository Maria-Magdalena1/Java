package Java_Basics.ConditionalStatements.Shopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int countVideoCards=Integer.parseInt(scanner.nextLine());
        int countProcessors=Integer.parseInt(scanner.nextLine());
        int countRam=Integer.parseInt(scanner.nextLine());

        double priceVideoCards=countVideoCards*250;
        double priceProcessor=priceVideoCards*0.35;
        double priceRam=priceVideoCards*0.10;

        double total=priceVideoCards+countProcessors*priceProcessor+countRam*priceRam;
        if(countVideoCards>countProcessors)
        {
            total-=total*0.15;
        }
        double diff=Math.abs(total-budget);
        if(budget>=total)
        {
            System.out.printf("You have %.2f leva left!",diff);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva more!",diff);
        }
    }
}
