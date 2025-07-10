package Java_Fundamentals.Arrays.EncryptSortPrintArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
       int [] values=new int[n];
        for(int i=0;i<n;i++)
        {
            int sum=0;
            String input=scanner.nextLine();
            for(int j = 0; j <input.length(); j++)
            {
                char letter=input.charAt(j);
                if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'
                ||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
                {
                    sum+=(letter*input.length());
                }
                else
                {
                    sum+=(letter/input.length());
                }

            }
            values[i]=sum;
        }
        Arrays.sort(values);
        for(int value :values)
        {
            System.out.println(value);
        }


    }
}
