package Java_Basics.NestedLoop.Profit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countOne=Integer.parseInt(scanner.nextLine());
        int countTwo=Integer.parseInt(scanner.nextLine());
        int countFive=Integer.parseInt(scanner.nextLine());
        int sum=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<=countOne;i++)
        {
            for (int j=0;j<=countTwo;j++)
            {
                for(int k=0;k<=countFive;k++)
                {
                    if((i+j*2+k*5)==sum)
                    {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,sum);
                    }
                }
            }
        }
    }
}
