package Java_Fundamentals.TextProcessing.HTML;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        String content=scanner.nextLine();
        System.out.println("<h1>");
        System.out.println("     "+title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("     "+content);
        System.out.println("</article>");
        String comments=scanner.nextLine();
        while (!comments.equals("end of comments")) {
            System.out.println("<div>");
            System.out.println("     "+comments);
            System.out.println("</div>");

            comments=scanner.nextLine();
        }
    }
}
