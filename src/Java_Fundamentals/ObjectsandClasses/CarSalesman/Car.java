package Java_Fundamentals.ObjectsandClasses.CarSalesman;

import java.text.Format;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model,Engine engine,String weight,String color) {
        this.model=model;
        this.engine=engine;
        this.weight=weight;
        this.color=color;
    }

    public Car(String model,Engine engine) {
        this(model,engine,"n/a","n/a");
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void printCarInfo() {
        System.out.printf("%s:%n", model);
        System.out.printf("  %s:%n", engine.getModel());
        System.out.printf("    Power: %d%n", engine.getPower());
        System.out.printf("    Displacement: %s%n", engine.getDisplacement());
        System.out.printf("    Efficiency: %s%n", engine.getEfficiency());
        System.out.printf("  Weight: %s%n", weight);
        System.out.printf("  Color: %s%n", color);
    }
}
