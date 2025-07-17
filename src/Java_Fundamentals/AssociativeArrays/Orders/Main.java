package Java_Fundamentals.AssociativeArrays.Orders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String,Double> productsPrice=new LinkedHashMap<>();
        Map<String,Integer> productsQuantity=new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String productName=input.split(" ")[0];
            double productPrice=Double.parseDouble(input.split(" ")[1]);
            int productQuantity= Integer.parseInt(input.split(" ")[2]);

            //proverqvame kolichestvoto
            if (productsQuantity.containsKey(productName)) {
                int currentQuantity=productsQuantity.get(productName);
                productsQuantity.put(productName,currentQuantity+productQuantity);
            } else {
                productsQuantity.put(productName,productQuantity);
            }

            //proverqvame cenata
            productsPrice.put(productName,productPrice);
            input=scanner.nextLine();
        }

        for (Map.Entry<String,Double> entry : productsPrice.entrySet()) {
            String name=entry.getKey();
            double price=entry.getValue();
            int quantity=productsQuantity.get(name);
            double totalPrice=price*quantity;

            System.out.printf("%s -> %.2f%n",name,totalPrice);

        }
    }
}
