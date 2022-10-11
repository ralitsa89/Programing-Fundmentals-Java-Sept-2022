package P12MethodsMoreExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String command = scanner.nextLine();
        String input = scanner.nextLine();

        dataTypes(command, input);
    }
    public static void dataTypes(String command, String input) {
        switch (command) {
            case "int":
                int num = Integer.parseInt(input);
                System.out.println(num * 2);
                break;
            case "real":
                double num1 = Double.parseDouble(input);
                System.out.printf("%.2f", num1 * 1.5);
                break;
            case "string":
                System.out.println("$" + input + "$");
                break;
        }
    }
}
