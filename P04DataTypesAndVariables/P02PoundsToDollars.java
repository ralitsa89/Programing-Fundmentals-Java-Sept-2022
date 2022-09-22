package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        float pound = Float.parseFloat(scanner.nextLine());

        float dollars = pound * 1.36f;

        System.out.printf("%.3f", dollars);
    }
}
