package Java_OOP.Encapsulation.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        //•	Meat – 1.2;
        //•	Veggies – 0.8;
        //•	Cheese – 1.1;
        //•	Sauce – 0.9;
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;

            default:
                throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
    }

    public double calculateCalories() {
        //•	Meat – 1.2;
        //•	Veggies – 0.8;
        //•	Cheese – 1.1;
        //•	Sauce – 0.9;

        double toppingWeightCoefficient = 0;
        switch (this.toppingType) {
            case "Meat":
                toppingWeightCoefficient = 1.2;
                break;
            case "Veggies":
                toppingWeightCoefficient = 0.8;
                break;
            case "Cheese":
                toppingWeightCoefficient = 1.1;
                break;
            case "Sauce":
                toppingWeightCoefficient = 0.9;
                break;
        }

        return 2 * weight * toppingWeightCoefficient;
    }
}
