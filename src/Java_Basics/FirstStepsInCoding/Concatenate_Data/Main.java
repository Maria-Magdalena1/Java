package Java_Basics.FirstStepsInCoding.Concatenate_Data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter town ");
        String town = scanner.nextLine();
        System.out.printf("You are %s %sq a %d-years old person from %s",
                firstName, lastName, age, town);
    }
}
