package Java_Fundamentals.ObjectsandClasses.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleData = scanner.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];
        Article articles = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] commands=scanner.nextLine().split(": ");
            switch (commands[0]) {
                case "Edit":
                    articles.edit(commands[1]);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(commands[1]);
                    break;
                case "Rename":
                    articles.rename(commands[1]);
                    break;
            }
        }
        System.out.println(articles);
    }
}
