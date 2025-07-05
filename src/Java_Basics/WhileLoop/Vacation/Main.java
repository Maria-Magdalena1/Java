package Java_Basics.WhileLoop.Vacation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double neededMoney=Double.parseDouble(scanner.nextLine());
        double ownedMoney=Double.parseDouble(scanner.nextLine());

        int countDays=0;
        int countSpend=0;
        while(ownedMoney<neededMoney&&countSpend<5)
        {
            String command=scanner.nextLine();
            double money=Double.parseDouble(scanner.nextLine());
            if(command.equals("spend"))
            {
                if(money>ownedMoney)
                {
                    ownedMoney=0;
                }
                else
                {
                    ownedMoney-=money;
                }
                countSpend++;

            }
            else if(command.equals("save"))
            {
                ownedMoney+=money;
                countSpend=0;

            }
            countDays++;
        }
        if(countSpend==5)
        {
            System.out.println("You can't save the money.");
            System.out.printf("%d",countSpend);
        }
        if(ownedMoney>=neededMoney)
        {
            System.out.printf("You saved the money for %d days.",countDays);
        }

    }
}
