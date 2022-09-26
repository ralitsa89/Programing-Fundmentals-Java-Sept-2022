package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int firstChar = Integer.parseInt(scanner.nextLine());
        int lastChar = Integer.parseInt(scanner.nextLine());

        for (int code = firstChar; code <= lastChar ; code++) {
            System.out.print((char)code + " ");
        }
    }
}
