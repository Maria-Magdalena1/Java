package Java_Advanced.StackandQueues.MaximumElement;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numberStack=new ArrayDeque<>();
        for (int i=0;i<n;i++) {
            String command=scanner.nextLine();
            int currentNumber=Integer.parseInt(command.split("\\s+")[0]);
            switch (currentNumber){
                case 1:
                    int element=Integer.parseInt(command.split("\\s+")[1]);
                    numberStack.push(element);
                    break;
                case 2:
                    numberStack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(numberStack));
                    break;
            }
        }
    }
}
