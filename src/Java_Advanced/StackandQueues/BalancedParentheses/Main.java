package Java_Advanced.StackandQueues.BalancedParentheses;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> bracketsStack = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '{' || currentSymbol == '(' || currentSymbol == '[') {
                bracketsStack.push(currentSymbol);
            } else if (currentSymbol == '}' || currentSymbol == ')' || currentSymbol == ']') {
                if (bracketsStack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                char current = bracketsStack.pop();
                if (!isMatchingPair(current, currentSymbol)) {
                    System.out.println("NO");
                    return;
                }

            }
        }
            if (bracketsStack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
