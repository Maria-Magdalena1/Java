package Java_OOP.Polymorphism.Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] tokens=scanner.nextLine().split("\\s+");
        Vehicle car=createVehicle(tokens);

        tokens=scanner.nextLine().split("\\s+");
        Vehicle truck=createVehicle(tokens);

        Map<String,Vehicle> vehicles=new LinkedHashMap<>();
        vehicles.put("Car",car);
        vehicles.put("Truck",truck);
        int countCommands=Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=countCommands;i++) {
            tokens=scanner.nextLine().split("\\s+");
            String commandName=tokens[0];
            String type=tokens[1];

            switch (commandName) {
                case "Drive":
                    double distance=Double.parseDouble(tokens[2]);
                    String driveMessage=vehicles.get(type).drive(distance);
                    System.out.println(driveMessage);
                    break;
                case "Refuel":
                    double fuelAmount=Double.parseDouble(tokens[2]);
                    vehicles.get(type).refuel(fuelAmount);
                    break;
            }
        }
        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle createVehicle(String[] tokens) {
        String vehicleType=tokens[0];
        double fuelQuantity=Double.parseDouble(tokens[1]);
        double fuelConsumption=Double.parseDouble(tokens[2]);

        Vehicle vehicle=null;
        switch (vehicleType) {
            case "Car":
                vehicle=new Car(fuelQuantity,fuelConsumption);
                break;
            case "Truck":
                vehicle=new Truck(fuelQuantity,fuelConsumption);
                break;
        }
        return vehicle;
    }
}
