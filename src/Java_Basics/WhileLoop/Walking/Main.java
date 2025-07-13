package Java_Basics.WhileLoop.Walking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int sum = 0;
        while (!command.equals("Going home")) {
            int steps = Integer.parseInt(command);
            sum += steps;

            if (sum >= 10000) {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int moreSteps = Integer.parseInt(scanner.nextLine());
            sum += moreSteps;
        }
        if (sum >= 10000) {
            int diff = sum - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            int diff = 10000 - sum;
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
