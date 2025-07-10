package Java_Fundamentals.Methods.PasswordValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        if(getLength(password)&&isLettersandDigits(password)&&containsAtLeast2Digits(password))
        {
            System.out.println("Password is valid");
            return;
        }
        if(!getLength(password))
        {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!isLettersandDigits(password))
        {
            System.out.println("Password must consist only of letters and digits");
        }
        if(!containsAtLeast2Digits(password))
        {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean getLength(String password)
    {
        int length=password.length();
        if(length>=6&&length<=10)
        {
            return true;
        }
        return false;
    }

    private static boolean isLettersandDigits(String password)
    {
        int count=0;
        for(int i=0;i<password.length();i++)
        {
            if(Character.isLetter(password.charAt(i))||Character.isDigit(password.charAt(i)))
            {
                count++;
            }
        }
        if(count==password.length())
        {
            return true;
        }
        return false;
    }

    private static boolean containsAtLeast2Digits(String password)
    {
        int count=0;
        for(int i=0;i<password.length();i++)
        {
            if(Character.isDigit(password.charAt(i)))
            {
                count++;
            }
        }
        if(count>=2)
        {
            return true;
        }
        return false;
    }
}
