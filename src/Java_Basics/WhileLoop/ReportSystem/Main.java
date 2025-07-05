package Java_Basics.WhileLoop.ReportSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int neededMoney=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        int sumCard=0;
        int countCard=0;
        int sumCash=0;
        int countCash=0;
        int sum=0;
        int times=1;
        while(!input.equals("End"))
        {
            int price=Integer.parseInt(input);
            if(times%2==0)
            {
                if(price<10)
                {
                    System.out.println("Error in transaction!");
                }
                else
                {
                    sum+=price;
                    sumCard+=price;
                    countCard++;
                    System.out.println("Product sold!");
                }
            }
            else
            {
                if(price>100)
                {
                    System.out.println("Error in transaction!");

                }
                else
                {
                    sum+=price;
                    sumCash+=price;
                    countCash++;
                    System.out.println("Product sold!");
                }
            }

            if(sum>=neededMoney)
            {
                break;
            }
            times++;



            input=scanner.nextLine();
        }
        if(sum>=neededMoney)
        {
            System.out.printf("Average CS: %.2f%n",sumCash*1.0/countCash);
            System.out.printf("Average CC: %.2f",sumCard*1.0/countCard);
        }
        else
        {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
