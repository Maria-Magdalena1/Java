package Java_Fundamentals.TextProcessing.ExtractFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] file=scanner.nextLine().split("\\\\");
        String[] fileName=file[file.length-1].split("\\.");
        String extension=fileName[1];
        System.out.println("File name: "+fileName[0]);
        System.out.println("File extension: "+extension);
    }
}
