package P10Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double a = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println(df.format(calculate(a, operator, b)));

    }
    private static double calculate(double a, String operator, double b){
        double result = 0;
        switch (operator){
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;

        }
        return result;
    }
}
