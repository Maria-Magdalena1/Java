package Java_Fundamentals.Methods.SmallestofThreeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        int n3=Integer.parseInt(scanner.nextLine());
        getSmallestNumber(n1,n2,n3);
    }

    private static void getSmallestNumber(int n1,int n2,int n3)
    {
        int result=Math.min(Math.min(n1,n2),n3);
        System.out.println(result);
    }
}
