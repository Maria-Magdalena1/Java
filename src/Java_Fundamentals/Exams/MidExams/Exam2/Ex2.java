package Java_Fundamentals.Exams.MidExams.Exam2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            if (command.equals("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int currentNumber = numbers.get(index1);

                numbers.set(index1, numbers.get(index2));
                numbers.set(index2, currentNumber);
            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int newNumber=numbers.get(index1)*numbers.get(index2);
                numbers.set(index1,newNumber);

            } else if (command.equals("decrease")) {
                for (int i=0;i<numbers.size();i++) {
                    numbers.set(i,numbers.get(i)-1);
                }
            }
            input = scanner.nextLine();
        }

        for (int i=0;i<numbers.size();i++) {
            if (i!=numbers.size()-1) {
                System.out.printf("%d, ",numbers.get(i));
            } else {
                System.out.print(numbers.get(i));
            }
        }
    }
}
