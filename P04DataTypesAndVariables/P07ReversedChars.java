package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secoundSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdSymbol, secoundSymbol, firstSymbol);
    }
}
