package Java_Fundamentals.Exams.FinalExams.Exam4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String text=scanner.nextLine();
       String input=scanner.nextLine();

       while (!input.equals("Done")) {
           String [] tokens=input.split(" ");
           String command=tokens[0];

           switch (command) {
               case "TakeOdd":
                   String nexPass="";
                   for (int i=0;i<text.length();i++) {
                       if (i%2!=0) {
                           nexPass+=text.charAt(i);
                       }
                   }
                   text=nexPass;
                   System.out.println(text);
                   break;
               case "Cut":
                   int index=Integer.parseInt(tokens[1]);
                   int  length=Integer.parseInt(tokens[2]);
                   text=text.substring(0,index)+text.substring(index+length);
                   System.out.println(text);
                   break;
               case "Substitute":
                   String substring=tokens[1];
                   String substitute=tokens[2];
                   if (text.contains(substring)) {
                       text=text.replace(substring,substitute);
                       System.out.println(text);
                   } else {
                       System.out.println("Nothing to replace!");
                   }
                   break;
           }
           input=scanner.nextLine();
       }

        System.out.printf("Your password is: %s%n",text);
    }
}
