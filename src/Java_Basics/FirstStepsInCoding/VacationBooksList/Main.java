package Java_Basics.FirstStepsInCoding.VacationBooksList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int booksPages=Integer.parseInt(scanner.nextLine());
        int pagesFor1Hour=Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        int timeForReading=booksPages/pagesFor1Hour;
        int requiredHoursReadingPerDay=timeForReading/days;
        System.out.println(requiredHoursReadingPerDay);
    }
}
