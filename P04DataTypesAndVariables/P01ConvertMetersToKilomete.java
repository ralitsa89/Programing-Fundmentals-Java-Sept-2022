package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P01ConvertMetersToKilomete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        short meters = Short.parseShort(scanner.nextLine());

        double km = meters / 1000.0;

        System.out.printf("%.2f", km);
    }
}
