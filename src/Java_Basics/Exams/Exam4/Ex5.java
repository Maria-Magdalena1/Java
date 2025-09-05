package Java_Basics.Exams.Exam4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coloredEggs = Integer.parseInt(scanner.nextLine());
        int countRedEggs = 0;
        int countOrangeEggs = 0;
        int countBlueEggs = 0;
        int countGreenEggs = 0;
        for (int i = 0; i < coloredEggs; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    countRedEggs++;
                    break;
                case "orange":
                    countOrangeEggs++;
                    break;
                case "blue":
                    countBlueEggs++;
                    break;
                case "green":
                    countGreenEggs++;
                    break;
            }

        }

        int maxEggs = countRedEggs;
        String maxColor = "red";

        if (countOrangeEggs > maxEggs) {
            maxEggs = countOrangeEggs;
            maxColor = "orange";
        }
        if (countBlueEggs > maxEggs) {
            maxEggs = countBlueEggs;
            maxColor = "blue";
        }
        if (countGreenEggs > maxEggs) {
            maxEggs = countGreenEggs;
            maxColor = "green";
        }

        System.out.printf("Red eggs: %d%n",countRedEggs);
        System.out.printf("Orange eggs: %d%n",countOrangeEggs);
        System.out.printf("Blue eggs: %d%n",countBlueEggs);
        System.out.printf("Green eggs: %d%n",countGreenEggs);
        System.out.printf("Max eggs: %d -> %s",maxEggs,maxColor);

    }
}
