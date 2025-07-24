package Java_Advanced.SetsandDictionaries.ProductShop;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        //shop product price
        Map<String, Map<String,Double>> shopping=new TreeMap<>();
        while (!input.equals("Revision")) {
            String shop=input.split(", ")[0];
            String product=input.split(", ")[1];
            double price=Double.parseDouble(input.split(", ")[2]);

            //shopping.putIfAbsent(shop, new LinkedHashMap<>());
            //shopping.get(shop).put(product, price);


            //if we don't have the shop name
            if (!shopping.containsKey(shop)) {
                shopping.put(shop,new LinkedHashMap<>());
                Map<String,Double> productPrice=shopping.get(shop);
                productPrice.put(product,price);
            } else {
                //if we don't have the product
                if (!shopping.get(shop).containsKey(product)) {
                    shopping.get(shop).put(product,price);

                    //if we have product but the price is different
                } else {
                    shopping.get(shop).put(product,price);
                }
            }


            input=scanner.nextLine();
        }

        for (Map.Entry<String,Map<String,Double>> entry:shopping.entrySet()) {
            String shopName=entry.getKey();
            Map<String,Double> productAndName=entry.getValue();
            System.out.printf("%s->%n",shopName);
            productAndName.forEach((k,v)-> System.out.printf("Product: %s, Price: %.1f%n",k,v));
        }
    }
}
