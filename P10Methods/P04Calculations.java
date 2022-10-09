package P10Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add":
                addNumbers(firstNum, secondNum);
                break;
            case "multiply":
                multiplyNumbers(firstNum, secondNum);
                break;
            case "subtract":
                subtractNumbers(firstNum, secondNum);
                break;
            case "divide":
                divideNumbers(firstNum, secondNum);
                break;

        }
    }
    public static void addNumbers(int first, int second){
        int result = first + second;
        System.out.println(result);
    }
    public static void multiplyNumbers(int first, int second){
        int result = first * second;
        System.out.println(result);
    }
    public static void subtractNumbers(int first, int second){
        int result = first - second;
        System.out.println(result);
    }
    public static void divideNumbers(int first, int second){
        int result = first / second;
        System.out.println(result);
    }
}
