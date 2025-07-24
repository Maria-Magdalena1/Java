package Java_Advanced.SetsandDictionaries.Largest3Numbers;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())//.sorted((n1,n2)->n2.compareTo(n1))
                .collect(Collectors.toList());
        for (int i=0;i<3;i++) {
            System.out.print(numbers.get(i)+" ");
        }

        //List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
        //        .map(Integer::parseInt)
        //        .sorted(Comparator.reverseOrder())//.sorted((n1,n2)->n2.compareTo(n1))
        //        .limit(3)
        //        .collect(Collectors.toList());
        //
        //for (int num:numbers) {
        //    System.out.print(num+" ");
        //}

    }
}
