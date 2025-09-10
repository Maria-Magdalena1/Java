package Java_Fundamentals.Exams.FinalExams.Exam1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> stock = new LinkedHashMap<>();
        int soldFoods = 0;
        while (!input.equals("Complete")) {
            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            String food = parts[2];

            switch (command) {
                case "Receive":
                    if (quantity <= 0) {
                        input = scanner.nextLine();
                        continue;
                    }
                    stock.put(food, stock.getOrDefault(food, 0) + quantity);
                    break;
                case "Sell":
                    if (!stock.containsKey(food)) {
                        System.out.println("You do not have any " + food + ".");
                        input=scanner.nextLine();
                        continue;
                    }

                    if (stock.get(food) < quantity) {
                        int availableQuantity = stock.get(food);
                        System.out.printf("There aren't enough %s. You sold the last %d of them.%n",
                                food, availableQuantity);
                        stock.remove(food);
                        soldFoods+=availableQuantity;
                    } else {
                        int currentQuantity = stock.get(food);
                        stock.put(food, currentQuantity - quantity);
                        System.out.printf("You sold %d %s.%n", quantity, food);
                        soldFoods+=quantity;
                        if (stock.get(food) == 0) {
                            stock.remove(food);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String,Integer> entry:stock.entrySet()) {
            System.out.printf("%s: %s%n",entry.getKey(),entry.getValue());
        }
        System.out.printf("All sold: %d goods",soldFoods);
    }
}
