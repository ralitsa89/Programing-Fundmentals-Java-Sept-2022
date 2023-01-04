package P31Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class M0202DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        String regex = "([=\\/])(?<name>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int points = 0;
        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            String town = matcher.group("name");
            points += town.length();
            destinations.add(town);
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.printf("Travel Points: %d%n", points);
    }
}
