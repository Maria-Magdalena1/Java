package Java_Basics.Exams.Exam5;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int clients=Integer.parseInt(scanner.nextLine());
        double allClientsTotalPrice=0;
        for (int i=0;i<clients;i++) {
            String purchase=scanner.nextLine();
            double price=0;
            int countItems=0;
            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        price+=1.50;
                        countItems++;
                        break;
                    case "wreath":
                        price+=3.80;
                        countItems++;
                        break;
                    case "chocolate bunny":
                        price+=7;
                        countItems++;
                        break;
                }
                purchase=scanner.nextLine();
            }

            if (countItems%2==0) {
                price-=price*0.20;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n",countItems,price);
            allClientsTotalPrice+=price;
        }

        System.out.printf("Average bill per client is: %.2f leva.",allClientsTotalPrice/clients);
    }
}
