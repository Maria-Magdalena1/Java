package Java_Basics.NestedLoop.Combinations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int count=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                for(int y=0;y<=n;y++)
                {
                    if((i+j+y)==n)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
