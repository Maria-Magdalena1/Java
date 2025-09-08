package Java_Fundamentals.Exams.MidExams.Exam1;

import java.nio.file.Watchable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons=Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i=0;i<wagons.length;i++) {
            int space=4-wagons[i];
            if (waitingPeople>=space) {
                wagons[i]=4;
                waitingPeople-=space;
            } else {
                wagons[i]+=waitingPeople;
                waitingPeople=0;
                break;
            }
        }

        boolean hasEmptySpots=false;
        for (int wagon: wagons) {
            if (wagon<4) {
                hasEmptySpots=true;
                break;
            }
        }

        if (waitingPeople==0 &&hasEmptySpots) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople>0 &&!hasEmptySpots) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }

        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i]);
            if (i < wagons.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
