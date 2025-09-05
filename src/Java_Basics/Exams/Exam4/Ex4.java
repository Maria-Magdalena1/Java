package Java_Basics.Exams.Exam4;

import java.util.Collection;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int eggsFirstPlayer=Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        while (!command.equals("End")) {
            if (command.equals("one")) {
                eggsSecondPlayer--;
            } else if (command.equals("two")) {
                eggsFirstPlayer--;
            }
            if (eggsFirstPlayer==0||eggsSecondPlayer==0) {
                break;
            }
            command=scanner.nextLine();
        }

        if (eggsFirstPlayer==0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggsSecondPlayer);
        } else if (eggsSecondPlayer==0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggsFirstPlayer);
        } else {
            System.out.printf("Player one has %d eggs left.%n",eggsFirstPlayer);
            System.out.printf("Player two has %d eggs left.",eggsSecondPlayer);
        }
    }
}
