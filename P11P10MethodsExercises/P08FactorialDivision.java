package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactorial(n1);
        long fact2 = calculateFactorial(n2);

        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);

    }
    public static long calculateFactorial(int number){
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
