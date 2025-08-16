package Java_OOP.Encapsulation.ShoppingSpree;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name,double money) {
        this.setName(name);
        this.setMoney(money);
        this.products=new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name=name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setMoney(double money) {
        if (money>=0) {
            this.money=money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public void buyProducts(Product product) {
        if (this.money>=product.getCost()) {
            this.products.add(product);
            this.money-= product.getCost();
            System.out.printf("%s bought %s%n",this.getName(),product.getName());
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s%n",this.name,product.getName()));
        }

    }

    public String toString() {
        if (products.isEmpty()) {
            return name + " - Nothing bought";
        }
        StringBuilder sb = new StringBuilder(name + " - ");
        for (int i = 0; i < products.size(); i++) {
            sb.append(products.get(i).getName());
            if (i < products.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
