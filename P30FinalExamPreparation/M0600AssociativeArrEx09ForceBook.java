package P31Test;

import java.util.*;

import static java.lang.System.in;

public class M0600AssociativeArrEx09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                boolean isExisting = false;
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];
                if (!map.containsKey(side)) {
                    map.put(side, new ArrayList<>());
                }
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        isExisting = true;
                        break;
                    }
                }
                if (!isExisting) {
                    map.get(side).add(user);
                }
            } else if (input.contains(" -> ")) {
                String user = input.split(" -> ")[0];
                String side = input.split(" -> ")[1];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));
                if (map.containsKey(side)) {
                    map.get(side).add(user);
                } else {
                    map.put(side, new ArrayList<>());
                    map.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            input = scanner.nextLine();
        }
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
