package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numbOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) numbOfPeople / capacity);

        System.out.println(courses);
    }
}
