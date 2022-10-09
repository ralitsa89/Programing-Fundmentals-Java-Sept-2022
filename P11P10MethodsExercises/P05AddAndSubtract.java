package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sum(n1, n2);
        int subtractOfNumbers = subtract(sumOfNumbers, n3);

        System.out.println(subtractOfNumbers);

    }
    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    public static int subtract(int n1, int n2){
        return n1 - n2;
    }
}
