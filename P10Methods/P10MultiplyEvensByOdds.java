package P10Methods;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(n));
        
    }
    public static int getMultipleOfEvensAndOdds(int n){
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);

        return evenSum * oddSum;
    }

    public static int getEvenSum (int n){

        String intToString = Integer.toString(n);

        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] % 2 == 0){
                evenSum += arr[index];
            }
        }
        return evenSum;
    }
    public static int getOddSum(int n){

        String intToString = Integer.toString(n);

        int [] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
            for (int index = 0; index < arr.length; index++) {
                if(arr[index] % 2 != 0){
                    oddSum += arr[index];
                }
        }
        return oddSum;
    }
}
