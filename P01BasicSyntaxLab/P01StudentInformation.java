package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String studentName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);

    }
}
