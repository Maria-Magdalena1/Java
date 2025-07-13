package Java_Fundamentals.Lists.SoftUniCoursePlanning;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            if (input.startsWith("Add")) {
                String lessonTitle = input.split(":")[1];
                addLesson(lessons, lessonTitle);
            } else if (input.startsWith("Insert")) {
                String lessonTitle = input.split(":")[1];
                int index = Integer.parseInt(input.split(":")[2]);
                insertLesson(lessons, lessonTitle, index);
            } else if (input.startsWith("Remove")) {
                String lessonTitle = input.split(":")[1];
                removeLesson(lessons, lessonTitle);
            } else if (input.startsWith("Swap")) {
                String lessonTitle1 = input.split(":")[1];
                String lessonTitle2 = input.split(":")[2];
                swapLessons(lessons, lessonTitle1, lessonTitle2);
            } else if (input.startsWith("Exercise")) {
                String lessonTitle = input.split(":")[1];
                addExerciseLesson(lessons, lessonTitle);
            }

            input = scanner.nextLine();
        }
        int count = 1;
        for (String lesson : lessons) {
            System.out.printf("%d.%s%n", count, lesson);
            count++;
        }
    }

    private static void addLesson(List<String> lessons, String lessonTitle) {
        if (!lessons.contains(lessonTitle)) {
            lessons.add(lessonTitle);
        }
    }

    private static void insertLesson(List<String> lessons, String lessonTitle, int index) {
        if (!lessons.contains(lessonTitle)) {
            lessons.add(index, lessonTitle);
        }
    }

    private static void removeLesson(List<String> lessons, String lessonTitle) {
        if (lessons.contains(lessonTitle)) {
            int index = lessons.indexOf(lessonTitle);
            String exercise = lessonTitle + "-Exercise";
            if (lessons.contains(exercise)) {
                lessons.remove(exercise);
            }
            lessons.remove(lessonTitle);
        }

    }

    private static void swapLessons(List<String> lessons, String lessonTitle1, String lessonTitle2) {

        if (lessons.contains(lessonTitle1) && lessons.contains(lessonTitle2)) {
            int index1 = lessons.indexOf(lessonTitle1);
            int index2 = lessons.indexOf(lessonTitle2);
            String exercise1 = lessonTitle1 + "-Exercise";
            String exercise2 = lessonTitle2 + "-Exercise";
            if (lessons.contains(exercise1)) {
                int indexofExercise1 = lessons.indexOf(exercise1);
                lessons.set(index1, lessonTitle2);
                lessons.set(index2, lessonTitle1);
                lessons.remove(indexofExercise1);
                lessons.add(index2 + 1, lessonTitle1);


            } else if (lessons.contains(exercise2)) {
                int indexofExercise2 = lessons.indexOf(exercise2);
                lessons.set(index1, lessonTitle2);
                lessons.set(index2, lessonTitle1);
                lessons.remove(indexofExercise2);
                lessons.add(index1 + 1, exercise2);


            } else {
                lessons.set(index1, lessonTitle2);
                lessons.set(index2, lessonTitle1);
            }
        }
    }

    private static void addExerciseLesson(List<String> lessons, String lessonTitle) {
        String exercise = lessonTitle + "-Exercise";
        if (lessons.contains(lessonTitle) && !lessons.contains(exercise)) {
            int index = lessons.indexOf(lessonTitle);
            lessons.add(index + 1, exercise);
        } else {
            lessons.add(lessonTitle);
            lessons.add(lessonTitle + "-Exercise");
        }
    }
}
