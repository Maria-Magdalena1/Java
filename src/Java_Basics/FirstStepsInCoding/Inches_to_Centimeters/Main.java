package Java_Basics.FirstStepsInCoding.Inches_to_Centimeters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете реално число ");
        double number = Double.parseDouble(scanner.nextLine());
        double result = number * 2.54;
        System.out.println(result);
    }
}
