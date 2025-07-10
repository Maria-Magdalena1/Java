package Java_Fundamentals.Methods.PalindromeIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        while(!input.equals("END"))
        {
            if(isPalindrome(input))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }

            input=scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String text)
    {
        String reversed="";

        for(int position=text.length()-1;position>=0;position--)
        {
            char symbol=text.charAt(position);
            reversed+=symbol;
        }

        return text.equals(reversed);
    }
}
