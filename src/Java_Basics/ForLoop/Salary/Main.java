package Java_Basics.ForLoop.Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int salary=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++)
        {
            if(salary<=0)
            {
                System.out.println("You have lost your salary.");
                break;
            }
            String name=scanner.nextLine();
            if(name.equals("Facebook"))
            {
                salary-=150;
            }
            else if(name.equals("Instagram"))
            {
                salary-=100;
            }
            else if(name.equals("Reddit"))
            {
                salary-=50;
            }

        }

        if(salary>0)
        {
            System.out.println(salary);
        }
    }
}
