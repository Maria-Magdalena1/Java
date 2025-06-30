package Java_Basics.FirstStepsInCoding.DepositCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum=Double.parseDouble(scanner.nextLine());
        int months =Integer.parseInt(scanner.nextLine());
        double yearlyPercent=Double.parseDouble(scanner.nextLine());
        double sum=depositSum + months*((depositSum*yearlyPercent/100)/12);
        System.out.println(sum);
    }
}
