package Java_OOP.Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] pizzaTokens = scanner.nextLine().split("\\s+");
            Pizza pizza = new Pizza(pizzaTokens[1], Integer.parseInt(pizzaTokens[2]));

            String[] doughTokens = scanner.nextLine().split("\\s+");
            Dough dough = new Dough(doughTokens[1], doughTokens[2], Double.parseDouble(doughTokens[3]));
            pizza.setDough(dough);

            String input;
            while (!(input = scanner.nextLine()).equals("END")) {
                String[] toppingTokens = input.split("\\s+");
                Topping topping = new Topping(toppingTokens[1], Double.parseDouble(toppingTokens[2]));
                pizza.addTopping(topping);
            }

            System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverAllCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
