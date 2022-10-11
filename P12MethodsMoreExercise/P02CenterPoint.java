package P12MethodsMoreExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());


        System.out.println("(" + closerToTheCentre(x1, y1, x2, y2) + ")");
    }
    public static String closerToTheCentre (int x1, int y1, int x2, int y2){

        String closestPoint = "";

        int firstPoint = Math.abs(x1) + Math.abs(y1);
        int secondPoint = Math.abs(x2) + Math.abs(y2);

        if(firstPoint < secondPoint){
            closestPoint += x1 + ", " + y1;
        } else if (firstPoint > secondPoint) {
            closestPoint += x2 + ", " + y2;
        }else {
            closestPoint += x1 + ", " + y1;
        }
        return closestPoint;
    }
}
