package Java_Advanced.StackandQueues.PrinterQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        ArrayDeque<String> printerQueue=new ArrayDeque<>();
        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (!printerQueue.isEmpty()) {
                    System.out.println("Canceled "+printerQueue.poll());
                    //cancelled+printerQueue.peek()
                    //printerQueue.poll();
                } else {
                    System.out.println("Printer is on standby");
                }

            } else {
                printerQueue.offer(command);
            }
            command=scanner.nextLine();
        }
        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
