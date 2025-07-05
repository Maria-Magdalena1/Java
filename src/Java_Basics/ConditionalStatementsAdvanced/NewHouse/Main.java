package Java_Basics.ConditionalStatementsAdvanced.NewHouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeFlower=scanner.nextLine();
        int countFlowers=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());

        double total=0;
        switch(typeFlower)
        {
            case "Roses":
                total=countFlowers*5;
                if(countFlowers>80)
                {
                    total-=total*0.10;
                }
                break;
            case "Dahlias":
                total=countFlowers*3.80;
                if(countFlowers>90)
                {
                    total-=total*0.15;
                }
                break;
            case "Tulips":
                total=countFlowers*2.80;
                if(countFlowers>80)
                {
                    total-=total*0.15;
                }
                break;
            case "Narcissus":
                total=countFlowers*3;
                if(countFlowers<120)
                {
                    total+=total*0.15;
                }
                break;
            case "Gladiolus":
                total=countFlowers*2.50;
                if(countFlowers<80)
                {
                    total-=total*0.20;
                }
                break;
        }

        double diff=Math.abs(total-budget);
        if(budget>=total)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,typeFlower,diff);
        }
        else
        {
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
    }
}
