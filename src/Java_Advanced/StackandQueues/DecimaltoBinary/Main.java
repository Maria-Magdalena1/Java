package Java_Advanced.StackandQueues.DecimaltoBinary;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> convertedStack=new ArrayDeque<>();
        while (number!=0) {
            convertedStack.push(number%2);
            number/=2;
        }

        while (convertedStack.size()>0) {
            System.out.print(convertedStack.pop());
        }
    }
}
