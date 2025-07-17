package Java_Fundamentals.ObjectsandClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleMoreThan30=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] personData =scanner.nextLine().split(" ");
            String name= personData[0];
            int age= Integer.parseInt(personData[1]);
            Person person=new Person(name,age);
            if(age>30) {
                peopleMoreThan30.add(person);
            }
        }

        for (Person person : peopleMoreThan30) {
             System.out.println(person);
        }

    }
}
