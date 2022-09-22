package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(name+delimiter+surname);
    }
}
