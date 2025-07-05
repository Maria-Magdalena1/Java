package Java_Basics.NestedLoop.EqualSumsEvenOddPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int last=Integer.parseInt(scanner.nextLine());
        for(int i=first;i<=last;i++)
        {
            int sumOdd=0;
            int sumEven=0;
            int number=i;
            int position=0;
            while(number>0)
            {
                int currentDigit=number%10;
                if(position%2==0)
                {
                    sumEven+=currentDigit;
                }
                else
                {
                    sumOdd+=currentDigit;
                }
                number/=10;
                position++;
            }
            if(sumEven==sumOdd)
            {
                System.out.print(i+" ");
            }
        }
    }
}
