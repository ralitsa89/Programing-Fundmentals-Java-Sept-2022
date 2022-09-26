package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int startPower = pokePowerN;
        int countPoke = 0;
        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            countPoke++;
            if (pokePowerN == startPower / 2) {
                if (exhaustionFactorY != 0) {
                    pokePowerN = pokePowerN / exhaustionFactorY;
                }
            }
        }
        System.out.println(pokePowerN);
        System.out.println(countPoke);
    }
}
