package Java_OOP.WorkingWithAbstraction.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Card Suits:");

        Suit [] suits=Suit.values();

        for (Suit suit :suits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(),suit.name());
        }
    }
}
