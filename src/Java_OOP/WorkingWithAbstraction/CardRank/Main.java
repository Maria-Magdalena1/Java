package Java_OOP.WorkingWithAbstraction.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Card[] cards=Card.values();
        System.out.println("Card Ranks:");
        for (Card card :cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",card.ordinal(),card.name());

        }
    }
}
