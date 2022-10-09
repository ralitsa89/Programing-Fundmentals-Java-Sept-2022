package P10Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double gradeInput = Double.parseDouble(scanner.nextLine());

        printGrade(gradeInput);
    }

    public static void printGrade(double grade) {
        if (grade >= 2 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade <= 4.49) {
            System.out.println("Good");
        } else if (grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.println("Excellent");
        }
    }
}