package Java_Fundamentals.Methods.TopNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=n;i++) {
            if (divisibleBy8(i) && oneDigit(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean divisibleBy8(int n) {
        int sum=0;
        while (n>0) {
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum%8==0;
    }

    private static boolean oneDigit(int n) {
        int count=0;
        while (n>0) {
            int current=n%10;
            if (current%2!=0) {
                count++;
            }
            if (count>0) {
                return true;
            }
            n/=10;
        }
        return false;
    }
}
