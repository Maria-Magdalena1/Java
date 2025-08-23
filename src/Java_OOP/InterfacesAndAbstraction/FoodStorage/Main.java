package Java_OOP.InterfacesAndAbstraction.FoodStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Buyer> people=new HashMap<>();

        for (int i=0;i<n;i++) {
            String [] tokens=scanner.nextLine().split("\\s+");
            if (tokens.length==4) {
                String name=tokens[0];
                int age=Integer.parseInt(tokens[1]);
                String id=tokens[2];
                String birthDate=tokens[3];
                people.put(name,new Citizen(name,age,id,birthDate));
            } else if (tokens.length==3) {
                String name=tokens[0];
                int age=Integer.parseInt(tokens[1]);
                String group=tokens[2];
                people.put(name,new Rebel(name,age,group));

            }
        }

        String command=scanner.nextLine();
        while (!command.equals("End")) {
            Buyer buyer=people.get(command);
            if (buyer!=null) {
                buyer.buyFood();
            }
            command=scanner.nextLine();
        }
        int totalFood=people.values().stream().mapToInt(b->b.getFood()).sum();
        System.out.println(totalFood);
    }
}
