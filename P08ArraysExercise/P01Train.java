package P08ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int countWagons = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[countWagons];
        for (int wagon = 0; wagon < wagons.length; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons [wagon] = countPeople;
        }
        int sum = 0;
        for (int numbers : wagons) {
            System.out.print(numbers + " ");
            sum += numbers;
        }
        System.out.println();
        System.out.println(sum);
    }
}
