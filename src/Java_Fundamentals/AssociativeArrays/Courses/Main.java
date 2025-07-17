package Java_Fundamentals.AssociativeArrays.Courses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String, List<String>> courses=new LinkedHashMap<>();

        while(!input.equals("end")) {
            String course=input.split(" : ")[0];
            String name=input.split(" : ")[1];
            if (!courses.containsKey(course)) {
                courses.put(course,new ArrayList<>());
                courses.get(course).add(name);
            } else {
                courses.get(course).add(name);
            }
            input=scanner.nextLine();
        }

       for (Map.Entry<String,List<String>> entry : courses.entrySet()) {
           System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
           entry.getValue().forEach(name-> System.out.printf("-- %s%n",name));
       }
    }
}
