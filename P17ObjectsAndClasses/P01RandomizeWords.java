package P17ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        String[] wordsArr = input.split("\\s+");

        Random rndGenerator = new Random();
        for (int i = 0; i < wordsArr.length; i++) {
            int indexX = rndGenerator.nextInt(wordsArr.length);
            int indexY = rndGenerator.nextInt(wordsArr.length);

            String oldWordX = wordsArr[indexX];
            wordsArr[indexX] = wordsArr[indexY];
            wordsArr[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}