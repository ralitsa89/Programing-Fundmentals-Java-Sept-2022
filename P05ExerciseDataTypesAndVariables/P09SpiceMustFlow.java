package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int produced = 0;

        if (startingYield < 100) {
            System.out.println(days);
            System.out.println(produced);
        } else {
            while (startingYield >= 100) {
                produced += startingYield - 26;
                startingYield = startingYield - 10;
                days++;
            }
            System.out.println(days);
            System.out.println(produced - 26);
        }
    }
}