package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char symbol = scanner.nextLine().charAt(0);

        if(Character.isUpperCase(symbol)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
