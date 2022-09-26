package P06MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());

        if (Math.abs(n1 - n2) < 0.000001){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
