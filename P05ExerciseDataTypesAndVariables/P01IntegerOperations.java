package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int result = ((n1 +n2) / n3) * n4;
        System.out.println(result);

    }
}
