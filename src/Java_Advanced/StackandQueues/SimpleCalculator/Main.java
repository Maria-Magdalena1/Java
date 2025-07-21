package Java_Advanced.StackandQueues.SimpleCalculator;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack=new ArrayDeque<>();
        Collections.addAll(stack,input);
        while(stack.size()>1) {
            int firstNumber=Integer.parseInt(stack.pop());
            String operator=stack.pop();
            int secondNumber=Integer.parseInt(stack.pop());
            int result=0;
            if (operator.equals("+")) {
                result=firstNumber+secondNumber;
            } else {
                result=firstNumber-secondNumber;
            }

            stack.push(String.valueOf(result));
        }
        int result=Integer.parseInt(stack.peek());
        System.out.println(result);
    }
}
