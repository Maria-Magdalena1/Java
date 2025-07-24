package Java_Advanced.SetsandDictionaries.Voina;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Integer> firstPlayerCards=new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).forEach(firstPlayerCards::add);

        Set<Integer> secondPlayerCards=new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(secondPlayerCards::add);
        int rounds=50;
        while (rounds>0) {
            if (firstPlayerCards.isEmpty()||secondPlayerCards.isEmpty()) {
                break;
            }

            int firstCard=firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstCard);

            int secondCard=secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondCard);

            if (firstCard>secondCard) {
                firstPlayerCards.add(firstCard);
                firstPlayerCards.add(secondCard);
            } else if (secondCard>firstCard) {
                secondPlayerCards.add(secondCard);
                secondPlayerCards.add(firstCard);
            }
            rounds--;
        }

        if (firstPlayerCards.size()> secondPlayerCards.size()) {
            System.out.println("First player win!");
        } else if (secondPlayerCards.size()>firstPlayerCards.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }
}
