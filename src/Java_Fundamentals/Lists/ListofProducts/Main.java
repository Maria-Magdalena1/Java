package Java_Fundamentals.Lists.ListofProducts;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);
        }

        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
