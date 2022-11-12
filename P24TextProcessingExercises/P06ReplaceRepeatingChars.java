package P24TextProcessingExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb.length() - 1; i++) {
            char currentDigit = sb.charAt(i);
            char nextDigit = sb.charAt(i + 1);
            if(currentDigit == nextDigit){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
