package Java_Fundamentals.Revision.StrongNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int newN=n;
        while(newN>0)
        {
            int multiplication=1;
            int digit=newN%10;
            for(int i=1;i<=digit;i++)
            {
                multiplication*=i;
            }
            sum+=multiplication;
            newN/=10;
        }
        if(sum==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
