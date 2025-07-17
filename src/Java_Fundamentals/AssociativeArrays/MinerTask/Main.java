package Java_Fundamentals.AssociativeArrays.MinerTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String res=scanner.nextLine();
        Map<String,Integer> resources =new LinkedHashMap<>();
        while (!res.equals("stop")) {

            int quantity=Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(res)) {
                int existingQuantity=resources.get(res);
                resources.put(res,existingQuantity+quantity);
            } else {
                resources.put(res,quantity);
            }

            res=scanner.nextLine();
        }

        resources.entrySet().forEach(entry-> System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue()));
    }
}
