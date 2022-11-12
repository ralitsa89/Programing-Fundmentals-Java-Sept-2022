package P23TextProcessingLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String reversed = "";
            for (int i = input.length() - 1; i >= 0 ; i--) {
                char currentSymbol = input.charAt(i);
                reversed += currentSymbol;
            }

            System.out.printf("%s = %s%n", input, reversed);
            input = scanner.next();
        }
    }
}
