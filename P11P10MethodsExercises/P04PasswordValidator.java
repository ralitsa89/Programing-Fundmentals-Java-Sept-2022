package P11P10MethodsExercises;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String password = scanner.nextLine();

        if (passLengthValidation(password) && isConsistOnlyLettersAndDigits(password) && hasAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        }
        if (!passLengthValidation(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean passLengthValidation(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean isConsistOnlyLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtLeast2Digits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count++;
            }
        }
        return count >= 2;
    }
}
