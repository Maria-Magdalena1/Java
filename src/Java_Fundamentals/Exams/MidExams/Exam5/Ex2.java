package Java_Fundamentals.Exams.MidExams.Exam5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] rooms= scanner.nextLine().split("\\|");

        int initialHealth=100;
        int initialBitcoins=0;

        for (int i=0;i<rooms.length;i++) {
            String []parts=rooms[i].split("\\s+");
            String input =parts[0];
            int number=Integer.parseInt(parts[1]);

            switch (input) {
                case "potion":
                    if (number+initialHealth<=100) {
                        initialHealth+=number;
                    } else {
                        number=100-initialHealth;
                        initialHealth=100;
                    }
                    System.out.printf("You healed for %d hp.%n",number);
                    System.out.printf("Current health: %d hp.%n",initialHealth);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n",number);
                    initialBitcoins+=number;
                    break;
                default:
                    initialHealth-=number;
                    if (initialHealth<=0) {
                        System.out.printf("You died! Killed by %s.%n",input);
                        System.out.printf("Best room: %d",i+1);
                        return;
                    } else {
                        System.out.printf("You slayed %s.%n",input);
                    }
                    break;
            }
        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n",initialBitcoins);
        System.out.printf("Health: %d",initialHealth);
    }
}
