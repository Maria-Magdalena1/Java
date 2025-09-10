package Java_Fundamentals.Exams.FinalExams.Exam4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String regex="^@#+([A-Z][A-Za-z0-9]{4,}[A-Z])@#+$";
        Pattern pattern=Pattern.compile(regex);

        int n=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<n;i++) {
            String barcode=scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.matches()) {
                String content=matcher.group(1);

                StringBuilder productGroup=new StringBuilder();
                for (char ch:content.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        productGroup.append(ch);
                    }
                }

                if (productGroup.length()==0) {
                    productGroup.append("00");
                }
                System.out.println("Product group: " + productGroup);
            } else {
                System.out.println("Invalid barcode");
            }


        }
        scanner.close();
    }
}
