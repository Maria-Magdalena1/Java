package Java_Basics.NestedLoop.SumPrimeNonPrime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int sumprime=0;
        int sumnonprime=0;
        while(!input.equals("stop"))
        {
            int number=Integer.parseInt(input);
            if(number<0)
            {
                System.out.println("Number is negative.");
            }
            else
            {
                boolean isPrime=true;
                for(int i=2;i<number;i++)
                {
                    if(number%i==0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                {
                    sumprime+=number;
                }
                else
                {
                    sumnonprime+=number;
                }
            }

            input=scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumprime);
        System.out.printf("Sum of all non prime numbers is: %d%n",sumnonprime);
    }
}
