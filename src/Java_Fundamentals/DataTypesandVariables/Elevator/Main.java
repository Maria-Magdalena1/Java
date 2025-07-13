package Java_Fundamentals.DataTypesandVariables.Elevator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int fullCourse = n / p;
        if (n % p == 0) {
            System.out.println(fullCourse);
        } else {
            System.out.println(fullCourse + 1);
        }

    }
}
