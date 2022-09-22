package P04DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double length, width, height = 0;

        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
