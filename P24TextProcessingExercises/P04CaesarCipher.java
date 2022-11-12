package P24TextProcessingExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        for (Character symbol : text.toCharArray()) {
            System.out.print((char) (symbol + 3));
        }
    }
}
