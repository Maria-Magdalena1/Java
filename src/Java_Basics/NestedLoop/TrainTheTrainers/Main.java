package Java_Basics.NestedLoop.TrainTheTrainers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double finalsum = 0;
        int count = 0;
        while (!input.equals("Finish")) {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
            }
            System.out.printf("%s - %.2f%n", input, sum / n);
            finalsum += sum;
            count++;
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalsum / (n * count));
    }
}
