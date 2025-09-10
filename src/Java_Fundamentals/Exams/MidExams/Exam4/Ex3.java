package Java_Fundamentals.Exams.MidExams.Exam4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighborhood = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentPosition=0;

        String input = scanner.nextLine();
        while (!input.equals("Love!")) {
            String [] parts=input.split(" ");
            int jumpLength=Integer.parseInt(parts[1]);
            currentPosition+=jumpLength;
            if (currentPosition>= neighborhood.length) {
                currentPosition=0;
            }

            if (neighborhood[currentPosition]==0) {
                System.out.printf("Place %d already had Valentine's day.%n",currentPosition);
            } else {
                neighborhood[currentPosition]-=2;
                if (neighborhood[currentPosition]==0) {
                    System.out.printf("Place %d has Valentine's day.%n",currentPosition);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",currentPosition);

        int failedPlaces = 0;
        for (int hearts : neighborhood) {
            if (hearts > 0) {
                failedPlaces++;
            }
        }

        if (failedPlaces == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", failedPlaces);
        }
    }
}
