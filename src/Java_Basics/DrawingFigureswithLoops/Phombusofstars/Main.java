package Java_Basics.DrawingFigureswithLoops.Phombusofstars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");

            for(int k=1;k<i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row = 1; row <= n - 1; row++) {

            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int star = 1; star < n - row; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
