package Java_Fundamentals.Lists.MixedUpLists;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbersList2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sizeOfList = Math.min(numbersList1.size(), numbersList2.size());
        List<Integer> mixedList = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            int numberFromFirstList = numbersList1.getFirst();
            numbersList1.remove(numbersList1.getFirst());
            int numberFromSecondList = numbersList2.getLast();
            numbersList2.remove(numbersList2.getLast());
            mixedList.add(numberFromFirstList);
            mixedList.add(numberFromSecondList);
        }
        int startNumber = 0;
        int endNumber = 0;
        if (numbersList1.size() > numbersList2.size()) {
            startNumber = numbersList1.get(1);
            endNumber = numbersList1.get(0);

        } else if (numbersList2.size() > numbersList1.size()) {
            startNumber = numbersList2.get(0);
            endNumber = numbersList2.get(1);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer integer : mixedList) {
            if (integer > startNumber && integer < endNumber) {
                result.add(integer);
            }
        }
        Collections.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
