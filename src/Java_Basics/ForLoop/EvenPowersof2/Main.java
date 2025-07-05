package Java_Basics.ForLoop.EvenPowersof2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<=n;i+=2)
        {
            int number=(int)Math.pow(2,i);
            System.out.println(number);
        }
    }
}
