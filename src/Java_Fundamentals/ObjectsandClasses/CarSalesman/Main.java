package Java_Fundamentals.ObjectsandClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        Map<String,Engine> engines=new HashMap<>();
        for (int i=0;i<n;i++) {
            String [] engineData=scanner.nextLine().split("\\s+");
            String model =engineData[0];
            int power=Integer.parseInt(engineData[1]);

            Engine engine;
            if (engineData.length==2) {
                engine=new Engine(model,power);
            } else if (engineData.length==3) {
                if (isNumeric(engineData[2])) {
                    engine=new Engine(model,power,engineData[2],"n/a");
                } else {
                    engine=new Engine(model,power,"n/a",engineData[2]);
                }
            } else {
                engine=new Engine(model,power,engineData[2],engineData[3]);
            }

            engines.put(model,engine);

        }


        int m=Integer.parseInt(scanner.nextLine());
        List<Car> cars=new ArrayList<>();
        for (int i=0;i<m;i++) {
            String [] carData=scanner.nextLine().split("\\s+");
            String model=carData[0];
            String engineModel=carData[1];
            Engine engine=engines.get(engineModel);

            Car car;
            if (carData.length==2) {
                car=new Car(model,engine);
            } else if (carData.length==3) {
                if (isNumeric(carData[2])) {
                    car=new Car(model,engine,carData[2],"n/a");
                } else {
                    car=new Car(model,engine,"n/a",carData[2]);
                }
            } else {
                car=new Car(model,engine,carData[2],carData[3]);
            }

            cars.add(car);
        }

        for (Car car:cars) {
            car.printCarInfo();
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
