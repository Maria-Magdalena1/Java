package Java_Advanced.StreamsFilesDirectories.WriteToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "C:\\Users\\mariy\\IdeaProjects\\Java\\src\\Java_Advanced\\StreamsFilesDirectories\\resourcesLab\\input.txt";
        String outputPath = "C:\\Users\\mariy\\IdeaProjects\\Java\\src\\Java_Advanced\\StreamsFilesDirectories\\resourcesLab\\02.WriteToFileOutput.txt";
        try (//read from a file
             FileInputStream inputStream = new FileInputStream(inputPath);
             //write to a file
             OutputStream outputStream = new FileOutputStream(outputPath)) {

            int oneByte=inputStream.read();
            while (oneByte>=0) {
                char symbol= (char) oneByte;
                if (symbol!=','&&symbol!='.'&&symbol!='!'&&symbol!='?') {
                    outputStream.write(oneByte);
                }
                oneByte=inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
