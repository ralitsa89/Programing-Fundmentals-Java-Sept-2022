package P03MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String string = scanner.nextLine();
        String reversed = "";

        for (int position = string.length() - 1; position >= 0 ; position--) {
            char currentSymbol = string.charAt(position);
            reversed += currentSymbol;

        }
        System.out.println(reversed);
    }
}
