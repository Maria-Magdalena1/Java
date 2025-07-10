package Java_Fundamentals.Arrays.ArrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations=Integer.parseInt(scanner.nextLine());
        for(int rotation = 1; rotation <=rotations; rotation++)
        {
            int firstNumber=numbers[0];
            for(int position=0;position<numbers.length-1;position++)
            {
                numbers[position]=numbers[position+1];
            }
            numbers[numbers.length-1]=firstNumber;
        }
        for(int number:numbers)
        {
            System.out.print(number+" ");
        }
    }
}
