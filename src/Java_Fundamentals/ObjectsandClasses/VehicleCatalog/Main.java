package Java_Fundamentals.ObjectsandClasses.VehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicles> vehicles = new ArrayList<>();
        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);

            Vehicles vehicle = new Vehicles(type, model, color, horsepower);
            vehicles.add(vehicle);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            for (Vehicles vehicle : vehicles) {
                if (vehicle.getModel().equals(input)) {
                    System.out.println(vehicle);
                }
            }

            input = scanner.nextLine();
        }

        average(vehicles, "Car");
        average(vehicles, "Truck");
    }

    private static void average(List<Vehicles> vehicles, String type) {
        double sum = 0;
        int count = 0;
        for (Vehicles vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                sum += vehicle.getHorsepower();
                count++;
            }
        }
        double average = count == 0 ? 0 : sum / count;
        System.out.printf("%ss have average horsepower of: %.2f%n", type, average);
    }
}
