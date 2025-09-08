package Java_Fundamentals.Exams.MidExams.Exam3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> targets= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input=scanner.nextLine();
        while (!input.equals("End")) {
            String command=input.split("\\s+")[0];
            int index=Integer.parseInt(input.split("\\s+")[1]);
            if (command.equals("Shoot")) {
                int power=Integer.parseInt(input.split("\\s+")[2]);
                if (isInRange(index,targets.size())) {
                    targets.set(index,targets.get(index)-power);

                    if (targets.get(index)<=0) {
                        targets.remove(index);
                    }
                }
            } else if (command.equals("Add")) {
                int value= Integer.parseInt(input.split("\\s+")[2]);

                if (isInRange(index,targets.size())) {
                    targets.add(index,value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (command.equals("Strike")) {
                int radius= Integer.parseInt(input.split("\\s+")[2]);
               int leftBound=index-radius;
               int rightBound=index+radius;
               if (leftBound>=0&&rightBound<targets.size()) {
                   for (int i=rightBound;i>=leftBound;i--) {
                       targets.remove(i);
                   }
               } else {
                   System.out.println("Strike missed!");
               }
            }
            input=scanner.nextLine();
        }

        System.out.println(targets.stream().map(String::valueOf)
                .collect(Collectors.joining("|")));
    }
    public static boolean isInRange(int index,int lastIndex) {
        return index>=0&&index<lastIndex;
    }
}
