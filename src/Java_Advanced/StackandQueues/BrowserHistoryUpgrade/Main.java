package Java_Advanced.StackandQueues.BrowserHistoryUpgrade;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> historyStack = new ArrayDeque<>();
        ArrayDeque<String> forwardPagesQueue = new ArrayDeque<>();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (historyStack.size() > 1) {
                    forwardPagesQueue.offer(historyStack.pop());
                    System.out.println(historyStack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if(input.equals("forward")){
                if (!forwardPagesQueue.isEmpty()) {
                    String page=forwardPagesQueue.poll();
                    System.out.println(page);
                    historyStack.push(page);

                } else {
                    System.out.println("no next URLs");
                }
            } else{
                historyStack.push(input);
                System.out.println(historyStack.peek());
                forwardPagesQueue.clear();
            }
            input = scanner.nextLine();
        }
    }
}
