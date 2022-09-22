package P02BasicSyntaxExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule = 0;
        int daysInMonth = 0;
        int capsulesCount = 0;
        double coffeePrice = 0;
        double totalPrice = 0;



        for (int i = 1; i <= n; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            daysInMonth = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            coffeePrice =((daysInMonth * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);
            totalPrice += coffeePrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}