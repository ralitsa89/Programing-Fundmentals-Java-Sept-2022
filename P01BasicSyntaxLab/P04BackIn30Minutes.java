package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int initHour = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());

        int allMin = (initHour * 60 ) + initMinutes + 30;
        int hour = allMin / 60;
        int minutes = allMin % 60;

        if(hour > 23){
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
