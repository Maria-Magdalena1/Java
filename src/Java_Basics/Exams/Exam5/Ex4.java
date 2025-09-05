package Java_Basics.Exams.Exam5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startingQuantityEggs=Integer.parseInt(scanner.nextLine());
        int boughtEggs=0;
        String command=scanner.nextLine();
        while(!command.equals("Close")) {
            switch (command) {
                case "Buy":
                    int eggsToBuy=Integer.parseInt(scanner.nextLine());
                    if (startingQuantityEggs<eggsToBuy) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.",startingQuantityEggs);
                        break;
                    } else {
                        startingQuantityEggs-=eggsToBuy;
                        boughtEggs+=eggsToBuy;
                    }
                    break;
                case "Fill":
                    int eggsToFill=Integer.parseInt(scanner.nextLine());
                    startingQuantityEggs+=eggsToFill;
                    break;
            }
            command=scanner.nextLine();
        }
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.",boughtEggs);
    }
}
