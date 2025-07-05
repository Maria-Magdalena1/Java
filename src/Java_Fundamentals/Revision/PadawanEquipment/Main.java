package Java_Fundamentals.Revision.PadawanEquipment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int countStudents=Integer.parseInt(scanner.nextLine());
        double priceLightsabers=Double.parseDouble(scanner.nextLine());
        double priceRobes=Double.parseDouble(scanner.nextLine());
        double priceBelts=Double.parseDouble(scanner.nextLine());

        int countLightsabers=(int)Math.ceil(countStudents+countStudents*0.10);
        int count=0;
        for(int i=1;i<=countStudents;i++)
        {
            if(i%6==0)
            {
                count++;
            }
        }

        int countBelts=countStudents-count;
        double total=priceLightsabers*countLightsabers+priceRobes*countStudents+priceBelts*countBelts;
        if(money>=total)
        {
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }
        else
        {
            System.out.printf("George Lucas will need %.2flv more.",total-money);
        }

    }
}
