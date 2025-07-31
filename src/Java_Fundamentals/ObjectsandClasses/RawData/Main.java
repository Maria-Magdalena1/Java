package Java_Fundamentals.ObjectsandClasses.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < input.length; j += 2) {
                double pressure = Double.parseDouble(input[j]);
                int age = Integer.parseInt(input[j + 1]);
                Tire tire = new Tire(pressure, age);
                tires.add(tire);
                //tires.add(new Tire(pressure,age));
            }

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                for (Car car : cars) {
                    if (car.getCargo().getType().equals("fragile")) {
                        for (Tire tire : car.getTires()) {
                            if (tire.getPressure() < 1) {
                                System.out.println(car.getModel());
                                break;
                            }
                        }
                    }
                }
                break;
            case "flamable":
                for (Car car : cars) {
                    if (car.getCargo().getType().equals("flamable") &&
                            car.getEngine().getPower() > 250) {
                        System.out.println(car.getModel());
                    }
                }
                break;
        }
    }
}
