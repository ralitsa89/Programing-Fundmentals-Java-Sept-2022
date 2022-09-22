package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num % 2 != 0) {
            System.out.println("Please write an even number.");

            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d",Math.abs(num));
    }
}
