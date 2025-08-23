package Java_OOP.InterfacesAndAbstraction.BorderControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        List<Identifiable> entities=new ArrayList<>();

        String command= scanner.nextLine();
        while (!command.equals("End")) {
            String []tokens=command.split("\\s+");
            if (tokens.length==3) {
                String name=tokens[0];
                int age=Integer.parseInt(tokens[1]);
                String id=tokens[2];
                entities.add(new Citizen(name,age,id));
            } else if (tokens.length==2) {
                String model=tokens[0];
                String id=tokens[1];
                entities.add(new Robot(model,id));
            }
            command=scanner.nextLine();
        }

        String fakeIdEnding=scanner.nextLine();

        for (Identifiable entity:entities) {
            if (entity.getId().endsWith(fakeIdEnding)) {
                System.out.println(entity.getId());
            }
        }
    }
}
