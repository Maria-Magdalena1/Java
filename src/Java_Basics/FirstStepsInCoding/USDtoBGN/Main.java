package Java_Basics.FirstStepsInCoding.USDtoBGN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double leva = usd * 1.79549;
        System.out.println(leva);
    }
}
