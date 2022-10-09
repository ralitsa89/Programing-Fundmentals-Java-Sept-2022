package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        printVowelsCount(text.toLowerCase());

    }
    public static void printVowelsCount(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
