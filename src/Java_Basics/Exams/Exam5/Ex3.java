package Java_Basics.Exams.Exam5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String eggSize=scanner.nextLine();
        String eggColor=scanner.nextLine();
        int countPacketsOfEggs=Integer.parseInt(scanner.nextLine());

        int price=0;
        switch (eggSize) {
            case "Large":
                if (eggColor.equals("Red")) {
                    price=16;
                } else if (eggColor.equals("Green")) {
                    price=12;
                } else if (eggColor.equals("Yellow")) {
                    price=9;
                }
                break;
            case "Medium":
                if (eggColor.equals("Red")) {
                    price=13;
                } else if (eggColor.equals("Green")) {
                    price=9;
                } else if (eggColor.equals("Yellow")) {
                    price=7;
                }
                break;
            case "Small":
                if (eggColor.equals("Red")) {
                    price=9;
                } else if (eggColor.equals("Green")) {
                    price=8;
                } else if (eggColor.equals("Yellow")) {
                    price=5;
                }
                break;
        }

        double expenses=price*countPacketsOfEggs*0.35;
        double finalSum=price*countPacketsOfEggs-expenses;
        System.out.printf("%.2f leva.",finalSum);
    }
}
