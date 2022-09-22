package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double grade = Double.parseDouble(scanner.nextLine());

        if(grade >= 3){
            System.out.println("Passed!");
        }
    }
}
