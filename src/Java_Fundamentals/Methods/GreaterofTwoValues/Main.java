package Java_Fundamentals.Methods.GreaterofTwoValues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int n1 = Integer.parseInt(scanner.nextLine());
                int n2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(n1, n2));
                break;
            case "char":
                char num1 = scanner.nextLine().charAt(0);
                char num2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(num1, num2));
                break;
            case "string":
                String number1 = scanner.nextLine();
                String number2 = scanner.nextLine();
                System.out.println(getMax(number1, number2));
                break;
        }
    }

    private static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);

    }

    private static char getMax(char firstNum, char secondNum) {

        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    private static String getMax(String firstNum, String secondNum) {
        if (firstNum.compareTo(secondNum) >= 0) {
            return firstNum;
        }
        return secondNum;
    }
}
