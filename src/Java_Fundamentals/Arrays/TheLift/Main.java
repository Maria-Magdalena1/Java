package Java_Fundamentals.Arrays.TheLift;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isLiftFull = true;
        for (int i = 0; i < wagons.length; i++) {
            int availableSpace = 4 - wagons[i];

            if (availableSpace > 0) {
                if (availableSpace > people) {
                    wagons[i] += people;
                    people = 0;
                    isLiftFull = false;
                } else {
                    wagons[i] = 4;
                    people -= availableSpace;
                }
            }

        }

        if (!isLiftFull) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
