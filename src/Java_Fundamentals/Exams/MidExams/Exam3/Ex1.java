package Java_Fundamentals.Exams.MidExams.Exam3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int initialEnergy=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        int wonBattles=0;
        while (!input.equals("End of battle")) {
            int distance=Integer.parseInt(input);
            if (initialEnergy>=distance) {
                wonBattles++;
                initialEnergy-=distance;

                if (wonBattles%3==0) {
                    initialEnergy+=wonBattles;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",
                        wonBattles,initialEnergy);
                return;
            }

            input=scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",wonBattles,initialEnergy);
    }
}
