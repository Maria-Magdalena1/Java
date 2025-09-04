package Java_Basics.Exams.Exam3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countMovies=Integer.parseInt(scanner.nextLine());
        double highestRating=Double.MIN_VALUE;
        double lowestRating=Double.MAX_VALUE;
        String movieWithHighestRating="";
        String movieWithLowestRating="";
        double sumRating=0;
        for (int i=1;i<=countMovies;i++) {
            String movieName=scanner.nextLine();
            double rating=Double.parseDouble(scanner.nextLine());
            if (rating>highestRating) {
                highestRating=rating;
                movieWithHighestRating=movieName;
            }
            if (rating<lowestRating) {
                lowestRating=rating;
                movieWithLowestRating=movieName;
            }
            sumRating+=rating;
        }
        System.out.printf("%s is with highest rating: %.1f%n",movieWithHighestRating,highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n",movieWithLowestRating,lowestRating);
        System.out.printf("Average rating: %.1f",sumRating/countMovies);
    }
}
