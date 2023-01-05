package P33CommonLabBitwiseOperations;

import java.util.Scanner;

import static java.lang.System.in;

public class P011BinaryDigitsCount {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());
        int zeroOrOne = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        while (number > 0){
            int leftover = number % 2;
            if(leftover == zeroOrOne){
                counter++;
            }
            number /= 2;
        }
        System.out.println(counter);
    }
}
