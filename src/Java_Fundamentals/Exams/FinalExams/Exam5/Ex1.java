package Java_Fundamentals.Exams.FinalExams.Exam5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();

        String input=scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String operation=tokens[0];

            switch (operation) {
                case "Contains":
                    String substring=tokens[1];
                    if (text.contains(substring)) {
                        System.out.printf("%s contains %s%n",text,substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String command=tokens[1];
                    int startIndex= Integer.parseInt(tokens[2]);
                    int endIndex= Integer.parseInt(tokens[3]);

                    if (command.equals("Upper")) {
                        String sub=text.substring(startIndex,endIndex).toUpperCase();
                        text=text.substring(0,startIndex)+sub+text.substring(endIndex);
                        System.out.println(text);
                    } else if (command.equals("Lower")) {
                        String sub=text.substring(startIndex,endIndex).toLowerCase();
                        text=text.substring(0,startIndex)+sub+text.substring(endIndex);
                        System.out.println(text);
                    }
                    break;
                case "Slice":
                    int startingIndex= Integer.parseInt(tokens[1]);
                    int endingIndex= Integer.parseInt(tokens[2]);
                    text=text.substring(0,startingIndex)+text.substring(endingIndex);
                    System.out.println(text);
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.println("Your activation key is: "+text);
    }
}
