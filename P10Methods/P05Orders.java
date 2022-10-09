package P10Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        double n = Double.parseDouble(scanner.nextLine());

        calculatesOrders(input, n);
    }

    public static void calculatesOrders(String input, double n) {
        switch (input) {

            case "coffee":
                double sum = 1.50 * n;
                System.out.printf("%.2f", sum);
                break;
            case "water":
                sum = 1 * n;
                System.out.printf("%.2f", sum);
                break;
            case "coke":
                sum = 1.40 * n;
                System.out.printf("%.2f", sum);
                break;
            case "snacks":
                sum = 2 * n;
                System.out.printf("%.2f", sum);
                break;
        }
    }
}
