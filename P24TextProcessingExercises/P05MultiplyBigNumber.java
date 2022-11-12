package P24TextProcessingExercises;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));  //     *
       //System.out.println(firstNumber.divide(secondNumber));    //     /
        //System.out.println(firstNumber.add(secondNumber));       //      +
        //System.out.println(firstNumber.subtract(secondNumber));  //     -
    }
}
