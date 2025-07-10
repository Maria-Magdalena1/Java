package Java_Fundamentals.Arrays.ZigZagArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int [] firstArray=new int[n];
        int [] secondArray=new int[n];
        for(int i=1;i<=n;i++)
        {
            String input=scanner.nextLine();
            int firstNumber=Integer.parseInt(input.split(" ")[0]);
            int secondNumber=Integer.parseInt(input.split(" ")[1]);
            if(i%2==0)
            {
                secondArray[i-1]=firstNumber;
                firstArray[i-1]=secondNumber;
            }
            else
            {
                firstArray[i-1]=firstNumber;
                secondArray[i-1]=secondNumber;
            }
        }
        for(int num1:firstArray)
        {
            System.out.print(num1+" ");
        }
        System.out.println();
        for(int num2:secondArray)
        {
            System.out.print(num2+" ");
        }

    }
}
