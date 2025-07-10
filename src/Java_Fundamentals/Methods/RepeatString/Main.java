package Java_Fundamentals.Methods.RepeatString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(word,n));
    }

    private static String repeatString(String word,int n) {
        String result="";
        for(int i=0;i<n;i++)
        {
            result+=word;
        }
        return result;
    }
}
