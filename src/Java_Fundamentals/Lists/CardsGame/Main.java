package Java_Fundamentals.Lists.CardsGame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (Math.min(firstPlayer.size(), secondPlayer.size()) > 0) {

            int playerOneCard = firstPlayer.getFirst();
            int playerTwoCard = secondPlayer.getFirst();
            if (playerOneCard > playerTwoCard) {
                firstPlayer.add(playerOneCard);
                firstPlayer.add(playerTwoCard);
                firstPlayer.removeFirst();
                secondPlayer.removeFirst();
            } else if (playerTwoCard > playerOneCard) {
                secondPlayer.add(playerTwoCard);
                secondPlayer.add(playerOneCard);
                secondPlayer.removeFirst();
                firstPlayer.removeFirst();
            } else {
                firstPlayer.removeFirst();
                secondPlayer.removeFirst();
            }
        }
        int sum = 0;
        if (!firstPlayer.isEmpty()) {
            for (int cards : firstPlayer) {
                sum += cards;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (!secondPlayer.isEmpty()) {
            for (int cards : secondPlayer) {
                sum += cards;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}