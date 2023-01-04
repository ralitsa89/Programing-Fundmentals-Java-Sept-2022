package P31Test;

import java.util.*;

import static java.lang.System.in;

public class M0103ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> pieceMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);

            pieceMap.put(piece, pieceInfo);
        }

        String[] input = scanner.nextLine().split("\\|");
        while (!input[0].equals("Stop")) {
            String command = input[0];
            String piece = input[1];
            switch (command) {
                case "Add":
                    String composer = input[2];
                    String key = input[3];

                    if (pieceMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        List<String> newPieceInfo = new ArrayList<>();
                        newPieceInfo.add(composer);
                        newPieceInfo.add(key);
                        pieceMap.put(piece, newPieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (!pieceMap.containsKey(piece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    } else {
                        pieceMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = input[2];
                    if (!pieceMap.containsKey(piece)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    } else {
                        pieceMap.get(piece).remove(1);
                        pieceMap.get(piece).add(newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    }
                    break;
            }
            input = scanner.nextLine().split("\\|");
        }
        pieceMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0),
                        entry.getValue().get(1)));
    }
}
