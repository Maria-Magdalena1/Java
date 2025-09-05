package Java_Basics.Exams.Exam6;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int capacity=Integer.parseInt(scanner.nextLine());
        int availableSeats=capacity;

        int totalMoney=0;
        String command=scanner.nextLine();
        while (!command.equals("Movie time!")) {
            int people=Integer.parseInt(command);
            if (availableSeats<people) {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.",totalMoney);
                return;
            }
            if (people%3==0) {
                totalMoney+=people*5-5;
            } else {
                totalMoney+=people*5;
            }
            availableSeats-=people;
            command=scanner.nextLine();
        }

        System.out.printf("There are %d seats left in the cinema.%n",availableSeats);
        System.out.printf("Cinema income - %d lv.",totalMoney);

    }
}
