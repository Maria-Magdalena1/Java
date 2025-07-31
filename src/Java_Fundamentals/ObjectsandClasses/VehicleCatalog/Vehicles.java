package Java_Fundamentals.ObjectsandClasses.VehicleCatalog;

public class Vehicles {
    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Vehicles(String type,String model,String color,int horsepower) {
        this.type=type;
        this.model=model;
        this.color=color;
        this.horsepower=horsepower;
    }
    public String getType() {
        return type.substring(0,1).toUpperCase()+type.substring(1);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",type,model,color,horsepower);
    }
}
