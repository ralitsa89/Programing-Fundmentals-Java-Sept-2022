package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(n1, n2, n3);

    }
    public  static void printSmallestNumber(int n1, int n2, int n3){
        if(n1 <= n2 && n1 <= n3){
            System.out.println(n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
}
