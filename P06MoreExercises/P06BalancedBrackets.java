package P06MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                count++;
            }
            if(input.equals(")")){
                count--;
            }
            if(count < 0){
                System.out.println("UNBALANCED");
                return;
            }
        }
        if(count == 0){
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
