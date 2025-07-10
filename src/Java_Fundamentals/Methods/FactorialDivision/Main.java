package Java_Fundamentals.Methods.FactorialDivision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        factorialDivision(n1,n2);
    }

    private static void factorialDivision(int num1,int num2)
    {
        double division;
        long factorialFirstNumber =1;
        long factorialSecondNumber =1;
        for(int i=1;i<=num1;i++)
        {
            factorialFirstNumber *=i;
        }

        for(int i=1;i<=num2;i++)
        {
            factorialSecondNumber *=i;
        }

        division= factorialFirstNumber *1.0/ factorialSecondNumber;
        System.out.printf("%.2f",division);
    }
}
