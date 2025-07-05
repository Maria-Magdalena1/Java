package Java_Basics.ConditionalStatements.FuelTank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type=scanner.nextLine();
        double liters=Double.parseDouble(scanner.nextLine());
        String clubCard=scanner.nextLine();
        double total=0;
        if(clubCard.equals("Yes"))
        {
            if(type.equals("Diesel"))
            {
                total=liters*(2.33-0.12);
            }
            else if(type.equals("Gasoline"))
            {
                total=liters*(2.22-0.18);
            }
            else if(type.equals("Gas"))
            {
                total=liters*(0.93-0.08);
            }

            if(liters>=20 && liters<=25)
            {
                total-=total*0.08;
            }
            else if(liters>25)
            {
                total-=total*0.10;
            }
        }
        else
        {
            if(type.equals("Diesel"))
            {
                total=liters*2.33;
            }
            else if(type.equals("Gasoline"))
            {
                total=liters*2.22;
            }
            else if(type.equals("Gas"))
            {
                total=liters*0.93;
            }

            if(liters>=20 && liters<=25)
            {
                total-=total*0.08;
            }
            else if(liters>25)
            {
                total-=total*0.10;
            }
        }

        System.out.printf("%.2f lv.",total);

    }
}
