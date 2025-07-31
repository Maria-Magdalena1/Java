package Java_Fundamentals.ObjectsandClasses.OrderByAge;

import Java_Fundamentals.ObjectsandClasses.VehicleCatalog.Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        List<Person> people=new ArrayList<>();
        while (!input.equals("End")) {
            String name=input.split(" ")[0];
            String id=input.split(" ")[1];
            int age= Integer.parseInt(input.split(" ")[2]);

            Person person=new Person(name,id,age);
            people.add(person);

            input=scanner.nextLine();
        }

        people.sort((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()));
        for (Person person:people) {
            System.out.println(person);
        }
    }
}
