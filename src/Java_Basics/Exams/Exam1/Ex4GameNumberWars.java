package Java_Basics.Exams.Exam1;

import java.util.Scanner;

public class Ex4GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfFirstPlayer = scanner.nextLine();
        String nameOfSecondPlayer = scanner.nextLine();
        String input = scanner.nextLine();
        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        while (!input.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(input);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());
            if (firstPlayerCard > secondPlayerCard) {
                int points = firstPlayerCard - secondPlayerCard;
                firstPlayerPoints += points;
            } else if (secondPlayerCard > firstPlayerCard) {
                int points = secondPlayerCard - firstPlayerCard;
                secondPlayerPoints += points;
            } else {
                System.out.println("Number wars!");
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());
               if (firstPlayerCard>secondPlayerCard) {
                   System.out.printf("%s is winner with %d points",nameOfFirstPlayer,firstPlayerPoints);
                   return;
               } else if (secondPlayerCard>firstPlayerCard) {
                   System.out.printf("%s is winner with %d points",nameOfSecondPlayer,secondPlayerPoints);
                   return;
               }
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s has %d points%n",nameOfFirstPlayer,firstPlayerPoints);
        System.out.printf("%s has %d points",nameOfSecondPlayer,secondPlayerPoints);


    }
}
