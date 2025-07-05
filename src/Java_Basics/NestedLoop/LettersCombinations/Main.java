package Java_Basics.NestedLoop.LettersCombinations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char firstletter=scanner.nextLine().charAt(0);
        char lastletters=scanner.nextLine().charAt(0);
        char noletter=scanner.nextLine().charAt(0);
        int count=0;
        for(char i=firstletter;i<=lastletters;i++)
        {
            for(char j=firstletter;j<=lastletters;j++)
            {
                for(char z=firstletter;z<=lastletters;z++)
                {
                    if(i!=noletter&&j!=noletter&&z!=noletter)
                    {
                        count++;
                        System.out.print(""+i+j+z+" ");
                    }
                }
            }
        }
        System.out.println(count);

    }
}
