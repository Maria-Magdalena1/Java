package Java_Basics.ConditionalStatementsAdvanced.FishingBoat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int budget=Integer.parseInt(scanner.nextLine());
        String season=scanner.nextLine();
        int countFisherMan=Integer.parseInt(scanner.nextLine());

        double total=0;
        switch (season)
        {
            case "Spring":
                total=3000;
                if(countFisherMan>0 && countFisherMan<=6)
                {
                    total-=total*0.10;
                }
                else if(countFisherMan>=7 && countFisherMan<=11)
                {
                    total-=total*0.15;
                }
                else if(countFisherMan>=12)
                {
                    total-=total*0.25;
                }

                if(countFisherMan%2==0)
                {
                    total-=total*0.05;
                }
                break;
            case "Summer":
                total=4200;
                if(countFisherMan>0 && countFisherMan<=6)
                {
                    total-=total*0.10;
                }
                else if(countFisherMan>=7 && countFisherMan<=11)
                {
                    total-=total*0.15;
                }
                else if(countFisherMan>=12)
                {
                    total-=total*0.25;
                }

                if(countFisherMan%2==0)
                {
                    total-=total*0.05;
                }
                break;
            case "Autumn":
                total=4200;
                if(countFisherMan>0 && countFisherMan<=6)
                {
                    total-=total*0.10;
                }
                else if(countFisherMan>=7 && countFisherMan<=11)
                {
                    total-=total*0.15;
                }
                else if(countFisherMan>=12)
                {
                    total-=total*0.25;
                }
                break;
            case "Winter":
                total=2600;
                if(countFisherMan>0 && countFisherMan<=6)
                {
                    total-=total*0.10;
                }
                else if(countFisherMan>=7 && countFisherMan<=11)
                {
                    total-=total*0.15;
                }
                else if(countFisherMan>=12)
                {
                    total-=total*0.25;
                }

                if(countFisherMan%2==0)
                {
                    total-=total*0.05;
                }
                break;
        }

        double diff=Math.abs(total-budget);
        if(budget>=total)
        {
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}
