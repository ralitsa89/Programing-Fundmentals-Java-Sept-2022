package P12MethodsMoreExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num = Integer.parseInt(scanner.nextLine());

        calculation(num);
    }
    public static void calculation(int num) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 1;
        if (num > 0) {
            System.out.print(1 + " ");
        }
        for (int i = num; i > 1; i--) {
            int sum = n1 + n2 + n3;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = n3;
            n3 = sum;
        }
    }
}
