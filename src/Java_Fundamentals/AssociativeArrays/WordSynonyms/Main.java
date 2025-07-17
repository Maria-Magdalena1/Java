package Java_Fundamentals.AssociativeArrays.WordSynonyms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<String>> words=new LinkedHashMap<>();
        int n=Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=n;i++) {
            String word=scanner.nextLine();
            String synonym=scanner.nextLine();
            if (!words.containsKey(word)) {
                words.put(word,new ArrayList<>());
                words.get(word).add(synonym);
            } else {
                words.get(word).add(synonym);
            }
        }

        for (Map.Entry<String,List<String>> word : words.entrySet()) {
            System.out.printf("%s - %s%n",word.getKey(),String.join(", ",word.getValue()));
        }
    }
}
