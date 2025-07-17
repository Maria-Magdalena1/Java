package Java_Fundamentals.AssociativeArrays.OddOccurrences;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] arrayofWords=scanner.nextLine().split(" ");

        Map<String,Integer> mapofWords=new LinkedHashMap<>();

        for (String word : arrayofWords) {
            String lowerCaseWord =word.toLowerCase();
            if (!mapofWords.containsKey(lowerCaseWord)) {
                mapofWords.put(lowerCaseWord,1);
            } else {
                int occurrences=mapofWords.get(lowerCaseWord);
                mapofWords.put(lowerCaseWord,occurrences+1);
            }
        }

        List<String> listofWords=new ArrayList<>();
        for (Map.Entry<String,Integer> entry:mapofWords.entrySet()) {
            if (entry.getValue()%2!=0) {
                listofWords.add(entry.getKey());
            }

        }

       for (int i=0;i<listofWords.size();i++) {
           System.out.print(listofWords.get(i));
           if(i<listofWords.size()-1) {
               System.out.print(", ");
           }
       }
    }
}
