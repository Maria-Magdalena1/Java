package Java_Fundamentals.Methods.DataTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        switch (input)
        {
            case "int":
                int number=Integer.parseInt(scanner.nextLine());
                dataTypes(number);
                break;
            case "real":
                double num=Double.parseDouble(scanner.nextLine());
                dataTypes(num);
                break;
            case "string":
                String text=scanner.nextLine();
                dataTypes(text);
                break;
        }
    }
    private static void dataTypes(int number)
    {
        int result=number*2;
        System.out.println(result);
    }

    private static void dataTypes(double number)
    {
        double result=number*1.5;
        System.out.printf("%.2f",result);
    }

    private static void dataTypes(String text)
    {
        String newText="$";
        for(int i=0;i<text.length();i++)
        {
            newText+=text.charAt(i);
        }
        newText+="$";
        System.out.println(newText);
    }

}
