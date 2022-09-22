package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        boolean isValid = true;
        if (age >= 0 && age <= 18) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (typeOfDay.equals("Weekday")) {
                price = 18;
            } else if (typeOfDay.equals("Weekend")) {
                price = 20;
            } else if (typeOfDay.equals("Holiday")) {
                price = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (typeOfDay.equals("Weekday")) {
                price = 12;
            } else if (typeOfDay.equals("Weekend")) {
                price = 15;
            } else if (typeOfDay.equals("Holiday")) {
                price = 10;
            }
        } else {
            isValid = false;
        }
        if (!isValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
