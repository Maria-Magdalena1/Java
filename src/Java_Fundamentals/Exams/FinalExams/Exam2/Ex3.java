package Java_Fundamentals.Exams.FinalExams.Exam2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfPieces=Integer.parseInt(scanner.nextLine());

        //piece composer key
        Map<String, Map<String,String>> pieces=new LinkedHashMap<>();
        for (int i=0;i<numberOfPieces;i++) {
            String []input=scanner.nextLine().split("\\|");
            String piece=input[0];
            String composer=input[1];
            String key=input[2];

            pieces.putIfAbsent(piece,new LinkedHashMap<>());
            pieces.get(piece).putIfAbsent(composer,key);

        }

        String input=scanner.nextLine();
        while (!input.equals("Stop")) {
            String [] parts=input.split("\\|");
            String command=parts[0];
            String piece=parts[1];

            switch (command) {
                case "Add":
                    String composer=parts[2];
                    String key=parts[3];
                    if (pieces.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n",piece);
                    } else {
                        pieces.put(piece,new LinkedHashMap<>());
                        pieces.get(piece).put(composer,key);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }
                    break;
                case "Remove":
                    if (pieces.containsKey(piece)) {
                        pieces.remove(piece);
                        System.out.printf("Successfully removed %s!%n",piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey=parts[2];
                    if (pieces.containsKey(piece)) {
                        Map<String,String> composerMap=pieces.get(piece);
                        String composerName=composerMap.keySet().iterator().next();

                        composerMap.put(composerName,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
            }
            input=scanner.nextLine();
        }

        for (Map.Entry<String,Map<String,String>> entry:pieces.entrySet()) {
            String piece=entry.getKey();
            Map<String,String> composerAndKey=entry.getValue();
            String composer=composerAndKey.keySet().iterator().next();
            String key=composerAndKey.get(composer);
            System.out.printf("%s -> Composer: %s, Key: %s%n",piece,composer,key);
        }
    }
}
