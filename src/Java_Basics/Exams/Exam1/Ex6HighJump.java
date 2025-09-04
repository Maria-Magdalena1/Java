package Java_Basics.Exams.Exam1;

import java.util.Scanner;

public class Ex6HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedHeight = Integer.parseInt(scanner.nextLine());
        int height = wantedHeight - 30;
        int countTries = 0;
        int jumps = 1;
        while (height < wantedHeight) {
            int currentHeight = Integer.parseInt(scanner.nextLine());
            if (currentHeight > height) {
                height += 5;
                countTries=0;
            } else {
                countTries++;
            }
            jumps++;
            if (countTries==3) {
                break;
            }

        }
        if (countTries==3) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.",height,jumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",height,jumps);
        }
    }
}
