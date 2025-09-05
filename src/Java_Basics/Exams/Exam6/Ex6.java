package Java_Basics.Exams.Exam6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String movie=scanner.nextLine();

        int maxPoints =Integer.MIN_VALUE;
        String bestMovie="";

        int countMovies=1;
        while(!movie.equals("STOP")) {
            if (countMovies==7) {
                System.out.println("The limit is reached.");
                break;
            }
            int points=0;
            for (int i=0;i<movie.length();i++) {
                int currentLetterPoints=movie.charAt(i);
                points+=currentLetterPoints;
                if (Character.isLowerCase(movie.charAt(i))) {
                    points-=2*movie.length();
                } else if(Character.isUpperCase(movie.charAt(i))) {
                    points-=movie.length();
                }
            }

            if (points> maxPoints) {
                maxPoints =points;
                bestMovie=movie;
            }
            countMovies++;
            movie=scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.",bestMovie, maxPoints);
    }
}
