package Java_Basics.Exams.Exam6;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String serialName=scanner.nextLine();
        int seasons=Integer.parseInt(scanner.nextLine());
        int episodes=Integer.parseInt(scanner.nextLine());
        double duration=Double.parseDouble(scanner.nextLine());

        double adsMinutes=duration*0.20;
        double finalEpisodes=seasons*10;
        double total=(adsMinutes+duration)*episodes*seasons+finalEpisodes;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",serialName,Math.floor(total));
    }
}
