package Java_OOP.WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String rank=scanner.nextLine();
        String suit=scanner.nextLine();

        int cardPower= Card.valueOf(rank).getPowers()+Suit.valueOf(suit).getPowers();
        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,cardPower);
    }
}
