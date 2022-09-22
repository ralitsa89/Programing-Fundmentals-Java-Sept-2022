package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String country = scanner.nextLine();

        switch (country){
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
