package Java_Fundamentals.Methods.MultiplyEvensbyOdds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleofEvensAndOdds(number));

    }
    private static int getMultipleofEvensAndOdds(int n)
    {
        int evenSum=getSumofEvenDigits(n);
        int oddSum=getSumofOddDigits(n);

        return evenSum*oddSum;
    }

    private static int getSumofOddDigits(int n) {
        int oddSum=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit%2!=0)
            {
                oddSum+=digit;
            }
            n/=10;
        }
        return oddSum;
    }

    private static int getSumofEvenDigits(int n) {
        int evenSum =0;
        while(n>0)
        {
            int digit=n%10;
            if(digit%2==0)
            {
                evenSum +=digit;
            }
            n/=10;
        }
        return evenSum;
    }
}
