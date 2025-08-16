package Java_OOP.Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
        this.toppings=new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty() && name.trim().length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setToppings(int numberOfToppings) {
        if (numberOfToppings>=0&&numberOfToppings<=10) {
            this.toppings = new ArrayList<>();
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverAllCalories() {
        return this.dough.calculateCalories()+
                this.toppings.stream().mapToDouble(topping->topping.calculateCalories()).sum();
    }
}
