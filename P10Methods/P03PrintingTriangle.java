package P10Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numInput = Integer.parseInt(scanner.nextLine());

        printTriangle(numInput);
    }

    public static void printTriangle(int num){
        for (int i = 1; i <= num; i++) {
            printLine(1, i);
        }
        for (int i = num - 1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }
    public static void printLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
