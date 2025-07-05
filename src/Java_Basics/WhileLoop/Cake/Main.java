package Java_Basics.WhileLoop.Cake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int width=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        int pieces=width*length;

        String command=scanner.nextLine();
        while(!command.equals("STOP"))
        {
            int cake=Integer.parseInt(command);
            pieces-=cake;
            if(pieces<=0)
            {
                int diff = Math.abs(pieces);
                System.out.printf("No more cake left! You need %d pieces more.",diff);
                break;
            }

            command=scanner.nextLine();
        }
        if(pieces>0)
        {
            System.out.printf("%d pieces are left.",pieces);
        }
    }
}
