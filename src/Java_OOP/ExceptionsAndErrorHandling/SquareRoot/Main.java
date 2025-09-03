package Java_OOP.ExceptionsAndErrorHandling.SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number<0) {
                throw new IllegalArgumentException();
            }

            double sqrt=Math.sqrt(number);
            System.out.printf("%.2f%n",sqrt);

        }catch (Exception ex) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
