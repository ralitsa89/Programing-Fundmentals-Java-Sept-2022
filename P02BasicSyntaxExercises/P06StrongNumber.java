package P02BasicSyntaxExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num = Integer.parseInt(scanner.nextLine());
        int startNum =num;

        int sumFact = 0;
        while (num > 0){
            int lastDigit = num % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            num = num / 10;
        }
        if(sumFact == startNum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
