package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Integer.MIN_VALUE;
        int maxSnow = Integer.MIN_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int maxQuality = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow/snowballTime, snowballQuality);
            if(maxValue < snowballValue){
                maxValue = snowballValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);
    }
}
