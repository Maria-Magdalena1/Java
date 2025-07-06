package Java_Fundamentals.DataTypesandVariables.CharstoString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);
        char third=scanner.nextLine().charAt(0);
        String string=""+first+second+third;
        System.out.println(string);

    }
}
