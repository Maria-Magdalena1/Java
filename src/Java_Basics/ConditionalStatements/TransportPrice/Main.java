package Java_Basics.ConditionalStatements.TransportPrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String dayOrNight=scanner.nextLine();
        double total=0;
        if(dayOrNight.equals("day"))
        {
           if(n>0&&n<20)
           {
               total=0.70+0.79*n;
           }
           else if(n>=100)
           {
               total=0.06*n;
           }
           else
           {
               total=0.09*n;
           }
        }
        else if(dayOrNight.equals("night"))
        {
            if(n>0&&n<20)
            {
                total=0.70+0.90*n;
            }
            else if(n>=100)
            {
                total=0.06*n;
            }
            else
            {
                total=0.09*n;
            }
        }
        System.out.println(total);
    }
}
