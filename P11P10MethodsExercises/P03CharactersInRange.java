package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printCharactersInRange(symbol1, symbol2);
    }

    private static void printCharactersInRange(char symbol1, char symbol2) {
        if(symbol1 < symbol2){
            for (char symbol = (char) (symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        }else{
            for (char symbol = (char)(symbol2 + 1); symbol <symbol1 ; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
