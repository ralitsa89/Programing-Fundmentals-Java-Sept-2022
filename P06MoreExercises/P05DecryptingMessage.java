package P06MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String message = "";
        for (int i = 1; i <= lines; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);
            message += (char) (currentSymbol + key);
        }
        System.out.println(message);
    }
}
