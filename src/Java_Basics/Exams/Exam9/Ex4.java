package Java_Basics.Exams.Exam9;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        int maxPoints=Integer.MIN_VALUE;
        String powerfulWord="";

        while(!word.equals("End of words")) {
            int points=0;
            for (int i=0;i<word.length();i++) {
                points+=word.charAt(i);
            }
           switch (word.charAt(0)) {
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
               case 'y':
               case 'A':
               case 'E':
               case 'I':
               case 'O':
               case 'U':
               case 'Y':
                   points*=word.length();
                   break;
               default:
                   points/=word.length();
           }

            if (points>maxPoints) {
                maxPoints=points;
                powerfulWord=word;
            }
            word=scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d",powerfulWord,maxPoints);
    }
}
