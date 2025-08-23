package Java_OOP.InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        List<Birthable>birthables=new ArrayList<>();

        while(!input.equals("End")) {
            String []tokens=input.split("\\s+");
            String command=tokens[0];
            if (command.equals("Citizen")) {
                String name=tokens[1];
                int age=Integer.parseInt(tokens[2]);
                String id=tokens[3];
                String birthDate=tokens[4];
                birthables.add(new Citizen(name,age,id,birthDate));
            } else if (command.equals("Robot")) {
                String id=tokens[1];
                String model=tokens[2];
                new Robot(id,model);
            } else if (command.equals("Pet")) {
                String name=tokens[1];
                String birthDate=tokens[2];
                birthables.add(new Pet(name,birthDate));
            }
            input=scanner.nextLine();
        }

        String year=scanner.nextLine();
        for (Birthable b : birthables) {
            if (b.getBirthDate().endsWith(year)) {
                System.out.println(b.getBirthDate());
            }
        }
    }
}
