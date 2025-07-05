package Java_Basics.ForLoop.CleverLily;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int  age=Integer.parseInt(scanner.nextLine());
        double priceForWashingMachine=Double.parseDouble(scanner.nextLine());
        double priceForGames=Double.parseDouble(scanner.nextLine());

        double money=0;
        double countGames=0;
        double total;
        for(int i=1;i<=age;i++)
        {
            if(i%2==0)
            {
                money+=i*5;
            }
            else
            {
                countGames++;
            }
        }
        total=money+countGames*priceForGames-(countGames);
        double diff=Math.abs(total-priceForWashingMachine);
        if(total>=priceForWashingMachine)
        {
            System.out.printf("Yes! %.2f",diff);
        }
        else
            System.out.printf("No! %.2f",diff);

    }
}
