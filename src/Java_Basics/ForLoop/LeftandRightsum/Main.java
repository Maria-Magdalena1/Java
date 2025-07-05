package Java_Basics.ForLoop.LeftandRightsum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<n;i++)
        {
            int leftNum=Integer.parseInt(scanner.nextLine());
            leftSum+=leftNum;
        }
        for(int i=n;i<2*n;i++)
        {
            int rightNum=Integer.parseInt(scanner.nextLine());
            rightSum+=rightNum;
        }

        int diff=Math.abs(leftSum-rightSum);
        if(leftSum==rightSum)
        {
            System.out.printf("Yes, sum = %d",leftSum);
        }
        else
        {
            System.out.printf("No, diff = %d",diff);
        }
    }
}
