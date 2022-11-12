package P24TextProcessingExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input  = scanner.nextLine();

        String[] codes = input.split("\\s+");

        double totalSum = 0;
        for (String code : codes) {
            double modifyNumber = getModifiedNumber(code);
            totalSum += modifyNumber;
        }
        System.out.printf("%.2f", totalSum);

    }
    public static double getModifiedNumber(String codes){
        char firstLetter = codes.charAt(0);
        char secondLetter = codes.charAt(codes.length() - 1);
        double number = Double.parseDouble(codes.replace(firstLetter, ' ')
                .replace(secondLetter, ' ')
                .trim());

        if(Character.isUpperCase(firstLetter)){
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        }else{
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }
        if(Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int) secondLetter - 64;
            number -= positionUpperLetter;
        }else{
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
