package Java_Fundamentals.Exams.MidExams.Exam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input=scanner.nextLine();
        int moves=0;
        while (!input.equals("end")) {
            moves++;
            String [] indexes=input.split("\\s+");
            int index1=Integer.parseInt(indexes[0]);
            int index2=Integer.parseInt(indexes[1]);

            if (index1==index2||isOutOfBounds(index1, elements.size())||isOutOfBounds(index2, elements.size())) {
                String elementToAdd="-"+moves+"a";
                elements.add(elements.size()/2,elementToAdd);
                elements.add(elements.size()/2,elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement= elements.get(index1);
                String secondElement= elements.get(index2);

                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n",firstElement);
                    elements.remove(Math.max(index1, index2));
                    elements.remove(Math.min(index1, index2));
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!",moves);
                return;
            }

            input=scanner.nextLine();
        }

        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!",moves);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ",elements));
        }
    }
    public static boolean isOutOfBounds(int index,int endIndex) {
        return index<0||index>=endIndex;
    }
}
