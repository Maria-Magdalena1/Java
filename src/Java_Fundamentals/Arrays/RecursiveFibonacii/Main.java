package Java_Fundamentals.Arrays.RecursiveFibonacii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int result=GetFibonacci(n);
        System.out.println(result);
    }

    public static int GetFibonacci(int n)
    {
        if(n==1||n==2)
        {
            return 1;
        }
        return GetFibonacci(n-1)+GetFibonacci(n-2);

    }}
