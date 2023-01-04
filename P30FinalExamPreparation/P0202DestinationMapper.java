package P30FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class P0202DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String inputLine = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=\\/])(?<town>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(inputLine);

        int travelPoints = 0;
        List<String> destinationList = new ArrayList<>();
        while (matcher.find()){
            String destination = matcher.group("town");

            travelPoints += destination.length();

            destinationList.add(destination);
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", " , destinationList));
        System.out.printf("Travel Points: %d%n", travelPoints);
    }
}
