package Java_Advanced.StreamsFilesDirectories.ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\mariy\\IdeaProjects\\Java\\src\\Java_Advanced\\StreamsFilesDirectories\\resourcesLab\\input.txt";

        //FileInputStream inputStream=new FileInputStream(path);
        //int oneByte=inputStream.read();
        //while (oneByte>=0) {
        //System.out.println(oneByte);
        //oneByte=inputStream.read();
        //}
        try (FileInputStream inputStream = new FileInputStream(path)) {
            int oneByte = inputStream.read();
            while (oneByte >= 0) {
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
