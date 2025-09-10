package Java_Fundamentals.Exams.FinalExams.Exam1;

import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.nextLine();

        String input=scanner.nextLine();
        while (!input.equals("Registration")) {
            String [] parts=input.split("\\s+");
            String command=parts[0];
            switch (command) {
                case "Letters":
                    String lowerUpperCase=parts[1];
                    if (lowerUpperCase.equals("Lower")) {
                        username=username.toLowerCase();
                    } else if (lowerUpperCase.equals("Upper")) {
                        username=username.toUpperCase();
                    }
                    System.out.println(username);
                    break;
                case "Reverse":
                    int startIndex=Integer.parseInt(parts[1]);
                    int endIndex=Integer.parseInt(parts[2]);
                    if (isValidIndex(startIndex,username.length())&&isValidIndex(endIndex,username.length())) {
                        String substring=username.substring(startIndex,endIndex+1);
                        String reversed=new StringBuilder(substring).reverse().toString();
                        System.out.println(reversed);
                    }
                    break;
                case "Substring":
                    String substring=parts[1];
                    if (username.contains(substring)) {
                        username=username.replace(substring,"");
                        //int startingIndex=username.indexOf(substring);
                        //int lastIndex=username.lastIndexOf(substring);
                        //username=username.substring(0,startingIndex)+username.substring(lastIndex+1);
                        System.out.println(username);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n",username,substring);
                    }
                    break;
                case "Replace":
                    char givenChar=parts[1].charAt(0);
                    username=username.replace(givenChar,'-');
                    System.out.println(username);
                    break;
                case "IsValid":
                    char validChar=parts[1].charAt(0);
                    if (username.indexOf(validChar)>=0) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%c must be contained in your username.%n",validChar);
                    }
                    break;
            }
            input=scanner.nextLine();
        }
    }
    public static boolean isValidIndex(int index,int lastIndex) {
        return index>=0&&index<lastIndex;
    }
}
