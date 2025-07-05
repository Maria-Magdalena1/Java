package Java_Basics.NestedLoop.Building;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int floors=Integer.parseInt(scanner.nextLine());
        int room=Integer.parseInt(scanner.nextLine());
        for(int floor = floors; floor >=1; floor--)
        {
            for(int roo = 0; roo <room; roo++)
            {
                if(floor==floors)
                {
                    System.out.printf("L%d%d ",floor,roo);
                }
                else if(floor%2==0)
                {
                    System.out.printf("O%d%d ",floor,roo);
                }
                else
                {
                    System.out.printf("A%d%d ",floor,roo);
                }
            }
            System.out.println();
        }
    }
}
