package Java_Fundamentals.Exams.FinalExams.Exam3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String message=scanner.nextLine();
        String input=scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] parts=input.split(":\\|:");
            String command=parts[0];
            switch (command) {
                case "InsertSpace":
                    int index=Integer.parseInt(parts[1]);
                    message=message.substring(0,index)+" "+message.substring(index);
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring=parts[1];
                    if (message.contains(substring)) {
                        int startIndex=message.indexOf(substring);
                        int endIndex=startIndex+substring.length();
                        message=message.substring(0,startIndex)+message.substring(endIndex);
                        //String reverser=new StringBuilder(substring).reverse().toString();
                        //message=message+substring;
                        for (int i=substring.length()-1;i>=0;i--) {
                            message+=substring.charAt(i);
                        }
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String sub=parts[1];
                    String replacement=parts[2];
                    message=message.replace(sub,replacement);
                    System.out.println(message);
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message);
    }
}
