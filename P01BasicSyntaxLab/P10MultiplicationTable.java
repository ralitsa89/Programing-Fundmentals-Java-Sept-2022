package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int times = 1;
        while (times <= 10){
            int product = n * times;
            System.out.printf("%d X %d = %d%n", n, times, product);
            times++;
        }
    }
}
