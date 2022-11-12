package P23TextProcessingLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(toRemove);
        while (index != -1){
            text = text.replace(toRemove,"");

            index = text.indexOf(toRemove);
        }
        System.out.println(text);
    }
}
