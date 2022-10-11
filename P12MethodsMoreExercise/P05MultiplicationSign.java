package P12MethodsMoreExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int  num1 = Integer.parseInt(scanner.nextLine());
        int  num2 = Integer.parseInt(scanner.nextLine());
        int  num3 = Integer.parseInt(scanner.nextLine());

        findPositiveOrNegative(num1, num2, num3);
    }
    public static void findPositiveOrNegative(int n1, int n2, int n3){
        if(n1 == 0 || n2 == 0 || n3 == 0){
            System.out.println("zero");
        }else if((n1 > 0 && n2 > 0 && n3 > 0) || (n1 < 0 && n2 < 0 && n3 > 0) || (n1 < 0 && n2 > 0 && n3 < 0) || (n1 > 0 && n2 < 0 && n3 < 0)){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
