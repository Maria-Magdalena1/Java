package Java_Fundamentals.Lists.DrumSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> copyList = new ArrayList<>(drumSet);
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);
            for (int i = 0; i < copyList.size(); i++) {
                int currentQuality = copyList.get(i);
                currentQuality -= power;

                if (currentQuality <= 0) {
                    int initialQuality = drumSet.get(i);
                    int price = initialQuality * 3;

                    if (savings >= price) {
                        savings -= price;
                        currentQuality = initialQuality;
                    } else {
                        copyList.remove(i);
                        drumSet.remove(i);
                        i--;
                        continue;
                    }
                }

                copyList.set(i, currentQuality);
            }
            input = scanner.nextLine();
        }

        for (int drum : copyList) {
            System.out.print(drum + " ");
        }
        System.out.println();


        System.out.printf("Gabsy has %.2flv.%n", savings);
    }
}
