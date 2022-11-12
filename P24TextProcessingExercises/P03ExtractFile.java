package P24TextProcessingExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String path = scanner.nextLine();
        String[] pathParts = path.split("\\\\");
        String fullFileName = pathParts[pathParts.length - 1];
        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
