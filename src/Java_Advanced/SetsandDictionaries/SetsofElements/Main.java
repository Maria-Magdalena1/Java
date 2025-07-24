package Java_Advanced.SetsandDictionaries.SetsofElements;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sizes=scanner.nextLine();
        int n=Integer.parseInt(sizes.split(" ")[0]);
        int m=Integer.parseInt(sizes.split(" ")[1]);
        Set<Integer> firstSet=new LinkedHashSet<>();
        Set<Integer> secondSet=new LinkedHashSet<>();
        for (int i=0;i<n;i++) {
            int number= Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i=0;i<m;i++) {
            int number=Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        if (firstSet.size()>secondSet.size()) {
            for (int num:secondSet) {
                if (firstSet.contains(num)) {
                    System.out.print(num+" ");
                }
            }
        } else {
            for (int num:firstSet) {
                if (secondSet.contains(num)) {
                    System.out.print(num+" ");
                }
            }
        }
    }
}
