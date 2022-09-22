package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        byte centuries = Byte.parseByte(scanner.nextLine());

        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;


        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries,years, days, hours, minutes);
    }
}
