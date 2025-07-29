package Java_Advanced.StreamsFilesDirectories.CopyBytes;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "C:\\Users\\mariy\\IdeaProjects\\Java\\src\\Java_Advanced\\StreamsFilesDirectories\\resourcesLab\\input.txt";
        String outputPath = "C:\\Users\\mariy\\IdeaProjects\\Java\\src\\Java_Advanced\\StreamsFilesDirectories\\resourcesLab\\03.CopyBytesOutput.txt";
        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath);
        ) {
            int oneByte=inputStream.read();
            while (oneByte>=0) {
                if (oneByte==32||oneByte==10) {
                    outputStream.write(oneByte);
                } else {
                    String digits=String.valueOf(oneByte);
                    for (int i=0;i<digits.length();i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
                oneByte=inputStream.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
