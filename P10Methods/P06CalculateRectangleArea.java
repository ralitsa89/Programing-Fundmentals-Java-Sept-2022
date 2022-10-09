package P10Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int result= calculateArea(width,height);
        System.out.println(result);

    }
    private static int calculateArea(int width, int height){
        return width * height;
    }
}
