package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do{
            System.out.printf("%d X %d = %d%n",num, times, num * times);
            times++;
        }while (times <= 10);
    }
}
