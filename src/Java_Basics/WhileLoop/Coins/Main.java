package Java_Basics.WhileLoop.Coins;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        double totalcoins=Math.floor(money*100);
        int countcoins=0;
        while(totalcoins>0)
        {
            if(totalcoins>=200)
            {
                countcoins++;
                totalcoins-=200;


            }
            else if(totalcoins>=100)
            {
                countcoins++;
                totalcoins-=100;


            }
            else if(totalcoins>=50)
            {
                countcoins++;
                totalcoins-=50;
            }
            else if(totalcoins>=20)
            {
                countcoins++;
                totalcoins-=20;
            }
            else if(totalcoins>=10)
            {
                countcoins++;
                totalcoins-=10;
            }
            else if(totalcoins>=5)
            {
                countcoins++;
                totalcoins-=5;
            }
            else if(totalcoins>=2)
            {
                countcoins++;
                totalcoins-=2;
            }
            else if(totalcoins>=1)
            {
                countcoins++;
                totalcoins-=1;
            }

        }
        System.out.println(countcoins);
    }
}
