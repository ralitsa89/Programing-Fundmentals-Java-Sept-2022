package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String allSymbols = "";
        for (int i = 1; i <= 3; i++) {
            String symbol = scanner.nextLine();
            allSymbols += symbol;
        }
        System.out.println(allSymbols);
    }
}
