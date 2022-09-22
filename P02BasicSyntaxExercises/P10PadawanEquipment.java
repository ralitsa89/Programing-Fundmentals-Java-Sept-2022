package P02BasicSyntaxExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double budget = Double.parseDouble(scanner.nextLine());
        double studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sumSaber = Math.ceil(studentsCount + 0.10 * studentsCount) * saberPrice;
        double sumRobes = studentsCount * robePrice;
        double sumBelts = Math.ceil(studentsCount - studentsCount / 6) * beltPrice;

        double totalPrice = sumSaber + sumRobes + sumBelts;

        if (totalPrice <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
