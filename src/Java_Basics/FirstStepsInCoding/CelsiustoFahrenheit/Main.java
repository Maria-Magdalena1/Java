package Java_Basics.FirstStepsInCoding.CelsiustoFahrenheit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusDegrees = Double.parseDouble(scanner.nextLine());
        double fahren = (celsiusDegrees * 1.8) + 32;
        System.out.printf("%.2f", fahren);
    }
}
