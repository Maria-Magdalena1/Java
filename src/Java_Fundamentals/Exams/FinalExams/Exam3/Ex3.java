package Java_Fundamentals.Exams.FinalExams.Exam3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());

        //carName mileage fuel
        Map<String, int[]> cars = new LinkedHashMap<>();
        for (int i = 0; i < numberOfCars; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String car = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            cars.put(car, new int[]{mileage, fuel});

        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];
            String carName = tokens[1];

            if (command.equals("Drive")) {
                int distance = Integer.parseInt(tokens[2]);
                int requiredFuel = Integer.parseInt(tokens[3]);

                int availableLiters = cars.get(carName)[1];
                if (availableLiters >= requiredFuel) {
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                            carName, distance, requiredFuel);
                    cars.get(carName)[1] -= requiredFuel;
                    cars.get(carName)[0]+=distance;
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

                if (cars.get(carName)[0] >= 100000) {
                    System.out.printf("Time to sell the %s!%n", carName);
                    cars.remove(carName);
                }
            } else if (command.equals("Refuel")) {
                int fuel = Integer.parseInt(tokens[2]);

                int availableLitersOfFuel = cars.get(carName)[1];
                if (availableLitersOfFuel + fuel <= 75) {
                    cars.get(carName)[1] += fuel;
                } else {
                    fuel = 75-availableLitersOfFuel ;
                    cars.get(carName)[1] = 75;
                }

                System.out.printf("%s refueled with %d liters%n", carName, fuel);
            } else if (command.equals("Revert")) {
                int kilometers = Integer.parseInt(tokens[2]);
                cars.get(carName)[0] -= kilometers;
                if (cars.get(carName)[0] >= 10000) {
                    System.out.printf("%s mileage decreased by %d kilometers%n", carName, kilometers);
                } else {
                    cars.get(carName)[0] = 10000;
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, int[]> entry : cars.entrySet()) {
            String car = entry.getKey();
            int mileage = entry.getValue()[0];
            int fuel = entry.getValue()[1];
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car, mileage, fuel);
        }
    }
}
