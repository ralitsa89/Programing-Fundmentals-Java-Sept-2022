package P31Test;

import java.util.*;

import static java.lang.System.in;

public class M0403HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] hero = scanner.nextLine().split(" ");
            String name = hero[0];
            int hp = Integer.parseInt(hero[1]);
            int mp = Integer.parseInt(hero[2]);
            List<Integer> heroInfo = new ArrayList<>();
            heroInfo.add(hp);
            heroInfo.add(mp);
            heroMap.put(name, heroInfo);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String commands = input.split(" - ")[0];
            String heroName = input.split(" - ")[1];

            switch (commands) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(input.split(" - ")[2]);
                    String spellName = input.split(" - ")[3];

                    int currentMP = heroMap.get(heroName).get(1);

                    if (currentMP >= neededMP) {
                        heroMap.get(heroName).set(1, currentMP - neededMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMP - neededMP); // heroMap.get(heroName).get(1)
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(input.split(" - ")[2]);
                    String attacker = input.split(" - ")[3];

                    int currentHP = heroMap.get(heroName).get(0);
                    int newHP = currentHP - damage;

                    if (newHP > 0) {
                        heroMap.get(heroName).set(0, newHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, newHP);
                    } else {
                        heroMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(input.split(" - ")[2]);
                    int oldMP = heroMap.get(heroName).get(1);
                    int newMP = Math.min(oldMP + amount, 200);

                    heroMap.get(heroName).set(1, newMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, (newMP - oldMP));
                    break;
                case "Heal":
                    int givenAmount = Integer.parseInt(input.split(" - ")[2]);
                    int oldHP = heroMap.get(heroName).get(0);
                    int newHPP = Math.min(oldHP + givenAmount, 100);
                    heroMap.get(heroName).set(0, newHPP);

                    System.out.printf("%s healed for %d HP!%n", heroName, (newHPP - oldHP));
                    break;
            }

            input = scanner.nextLine();
        }

        heroMap.forEach((k, v) -> {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", k, v.get(0), v.get(1));
        });
    }
}
