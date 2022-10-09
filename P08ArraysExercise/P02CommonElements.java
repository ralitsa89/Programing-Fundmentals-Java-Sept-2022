package P08ArraysExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] arr1 = firstLine.split( " ");
        String[] arr2 = secondLine.split( " ");

        for (String elements2 : arr2) {
            for (String elements1 : arr1 ) {
                if(elements2.equals(elements1)){
                    System.out.print(elements2 + " ");
                }
            }
        }
    }
}
