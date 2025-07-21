package Java_Advanced.StackandQueues.SimpleTextEditor;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder text=new StringBuilder();
        ArrayDeque<String> historyStack =new ArrayDeque<>();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=n;i++) {
            String command=scanner.nextLine();
            int number=Integer.parseInt(command.split("\\s+")[0]);
            switch (number) {
                case 1:
                    String input=command.split("\\s+")[1];
                    text.append(input);
                    historyStack.push(text.toString());
                    break;
                case 2:
                    historyStack.push(text.toString());
                    int count=Integer.parseInt(command.split("\\s+")[1]);
                    text.delete(text.length()-count,text.length());
                    break;
                case 3:
                    int index=Integer.parseInt(command.split("\\s+")[1]);
                    if (index>=1&&index<=text.length()) {
                        System.out.println(text.charAt(index-1));
                    }
                    break;
                case 4:
                    if (!historyStack.isEmpty()) {
                        text=new StringBuilder(historyStack.pop());
                    }
                    break;
            }
        }
    }
}
