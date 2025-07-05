package Java_Basics.ConditionalStatementsAdvanced.TradeCommissions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String town =scanner.nextLine();
        double selling=Double.parseDouble(scanner.nextLine());
        double total;
        switch(town)
        {
            case "Sofia":
                if(selling>=0&&selling<=500)
                {
                    total=selling*0.05;
                    System.out.printf("%.2f",total);
                }
                else if(selling>500&&selling<=1000)
                {
                    total=selling*0.07;
                    System.out.printf("%.2f",total);
                }
                else if(selling>1000&&selling<=10000)
                {
                    total=selling*0.08;
                    System.out.printf("%.2f",total);
                }
                else if(selling>10000)
                {
                    total=selling*0.12;
                    System.out.printf("%.2f",total);
                }
                else
                {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if(selling>=0&&selling<=500)
                {
                    total=selling*0.045;
                    System.out.printf("%.2f",total);
                }
                else if(selling>500&&selling<=1000)
                {
                    total=selling*0.075;
                    System.out.printf("%.2f",total);
                }
                else if(selling>1000&&selling<=10000)
                {
                    total=selling*0.10;
                    System.out.printf("%.2f",total);
                }
                else if(selling>10000)
                {
                    total=selling*0.13;
                    System.out.printf("%.2f",total);
                }
                else
                {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if(selling>=0&&selling<=500)
                {
                    total=selling*0.055;
                    System.out.printf("%.2f",total);
                }
                else if(selling>500&&selling<=1000)
                {
                    total=selling*0.08;
                    System.out.printf("%.2f",total);
                }
                else if(selling>1000&&selling<=10000)
                {
                    total=selling*0.12;
                    System.out.printf("%.2f",total);
                }
                else if(selling>10000)
                {
                    total=selling*0.145;
                    System.out.printf("%.2f",total);
                }
                else
                {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
