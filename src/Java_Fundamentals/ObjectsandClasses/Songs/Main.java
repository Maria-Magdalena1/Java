package Java_Fundamentals.ObjectsandClasses.Songs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];
            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);

        }

        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)) ;
                System.out.println(song.getName());
            }
        }
    }
}
