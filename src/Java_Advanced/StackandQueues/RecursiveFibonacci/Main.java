package Java_Advanced.StackandQueues.RecursiveFibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(getFibonacci(n));
    }

    public static int getFibonacci(int n) {
        if (n==0) {
            return 1;
        } else if (n==1) {
            return 1;
        } else {
            return getFibonacci(n-1)+getFibonacci(n-2);
        }
    }
}
