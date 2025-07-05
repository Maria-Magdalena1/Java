package Java_Fundamentals.Revision.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.nextLine();
        String password="";
        int tries=0;
        for(int i=username.length()-1;i>=0;i--)
        {
            password+=username.charAt(i);

        }

        String input=scanner.nextLine();
        while(!input.equals(password))
        {
            tries++;
            if(tries>3)
            {
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input=scanner.nextLine();
        }
        if(tries<3)
        {
            System.out.printf("User %s logged in.",username);
        }
        else
        {
            System.out.printf("User %s blocked!",username);
        }


    }
}
