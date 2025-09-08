package Java_Fundamentals.Lists.Train;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.startsWith("Add")) {
                int passengersToTheEndWagon = Integer.parseInt(input.split(" ")[1]);
                wagons.add(passengersToTheEndWagon);
            } else {
                int passengersToWagon = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int availableSpace = maxCapacity - wagons.get(i);//75-32
                    if (availableSpace + passengersToWagon <= maxCapacity) {//30 +32<=75
                        wagons.set(i, passengersToWagon + wagons.get(i));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int w : wagons) {
            System.out.print(w + " ");
        }
    }
}
