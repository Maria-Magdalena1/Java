package Java_Advanced.SetsandDictionaries.CountRealNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double [] numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double,Integer>  elements=new LinkedHashMap<>();
        for (int i=0;i<numbers.length;i++) {
            double currentNumber=numbers[i];
            if (!elements.containsKey(currentNumber)) {
                elements.put(currentNumber,1);
            } else {
                int count=elements.get(currentNumber);
                elements.put(currentNumber,count+1);
            }
        }

        for (Double key:elements.keySet()) {
            System.out.println(String.format("%.1f -> %d",key,elements.get(key)));
        }

        //for (Map.Entry<Double,Integer> entry:elements.entrySet()) {
        //    System.out.printf("%.1f -> %d",entry.getKey(),entry.getValue());
        //}
    }
}
