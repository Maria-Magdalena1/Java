package Java_OOP.Encapsulation.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White")) {
            this.flourType = flourType;
        } else if (flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {
        //•	White – 1.5;
        //•	Wholegrain – 1.0;
        //•	Crispy – 0.9;
        //•	Chewy – 1.1;
        //•	Homemade – 1.0
        double flourTypeCoefficient = 0;
        double bakingTechnicsCoefficient = 0;
        switch (this.flourType) {
            case "White":
                flourTypeCoefficient = 1.5;
                break;
            case "Wholegrain":
                flourTypeCoefficient = 1.0;
                break;
        }

        switch (this.bakingTechnique) {
            case "Crispy":
                bakingTechnicsCoefficient = 0.9;
                break;
            case "Chewy":
                bakingTechnicsCoefficient = 1.1;
                break;
            case "Homemade":
                bakingTechnicsCoefficient = 1.0;
                break;
        }

        return 2 * this.weight * flourTypeCoefficient * bakingTechnicsCoefficient;
    }
}
