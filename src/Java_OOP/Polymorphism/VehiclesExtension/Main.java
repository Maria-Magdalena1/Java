package Java_OOP.Polymorphism.VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carDetails = scanner.nextLine().split("\\s+");
        String[] truckDetails = scanner.nextLine().split("\\s+");
        String[] busDetails = scanner.nextLine().split("\\s+");

        double carFuelQuantity = Double.parseDouble(carDetails[1]);
        double carFuelConsumption = Double.parseDouble(carDetails[2]);
        double carTankCapacity = Double.parseDouble(carDetails[3]);

        double truckFuelQuantity = Double.parseDouble(truckDetails[1]);
        double truckFuelConsumption = Double.parseDouble(truckDetails[2]);
        double truckTankCapacity = Double.parseDouble(truckDetails[3]);


        double busFuelQuantity = Double.parseDouble(busDetails[1]);
        double busFuelConsumption = Double.parseDouble(busDetails[2]);
        double busTankCapacity = Double.parseDouble(busDetails[3]);

        Car car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);
        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);
        Bus bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countCommands; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            String commandName = commandParts[0];
            String vehicleType = commandParts[1];
            double fuelQuantityOrDistance = Double.parseDouble(commandParts[2]);

            switch (commandName) {
                case "Drive":
                    if (vehicleType.equals("Car")) {
                        System.out.println(car.drive(fuelQuantityOrDistance));
                    } else if (vehicleType.equals("Truck")) {
                        System.out.println(truck.drive(fuelQuantityOrDistance));
                    } else if (vehicleType.equals("Bus")) {
                        System.out.println(bus.drive(fuelQuantityOrDistance));
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(bus.driveEmpty(fuelQuantityOrDistance));
                    break;
                case "Refuel":
                    if (vehicleType.equals("Car")) {
                        car.refuel(fuelQuantityOrDistance);
                    } else if (vehicleType.equals("Truck")) {
                        truck.refuel(fuelQuantityOrDistance);
                    } else if (vehicleType.equals("Bus")) {
                        bus.refuel(fuelQuantityOrDistance);
                    }
                    break;
            }
        }
            System.out.println(car);
            System.out.println(truck);
            System.out.println(bus);
    }
}
