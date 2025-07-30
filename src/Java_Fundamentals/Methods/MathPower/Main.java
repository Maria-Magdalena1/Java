package Java_Fundamentals.Methods.MathPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num=Double.parseDouble(scanner.nextLine());
        int power=Integer.parseInt(scanner.nextLine());
        double result=mathPower(num,power);
        System.out.printf("%.0f",result);
    }

    private static double mathPower(double num,int power) {
        double result=1;
        for (int i=0;i<power;i++) {
            result*=num;
        }
        return result;
    }
}
