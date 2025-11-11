package programs.yourprogram;

import java.util.Random;
import java.util.Scanner;

// 🧩 TEMPLATE: Copy this to your own folder and modify values.
public class Programnijose implements ProgramInterface {

    public String getName() { 
        return "Minecraft Mob Name Generator"; 
    }

    public String getDescription() { 
        return "My program generates unique Minecraft-style mob names."; 
    }

    public String getAuthor() { 
        return "Jose Cortez"; 
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Arrays r name components
        String[] prefixes = {"Dark", "Fire", "Ice", "Shadow", "Nether", "Ender", "Ancient", "Soul"};
        String[] bases = {"Zombie", "Creeper", "Spider", "Skeleton", "Golem", "Witch", "Slime", "Specter"};
        String[] suffixes = {"King", "Queen", "Brute", "Hunter", "Lord", "Minion", "Walker"};

        System.out.println("=== Minecraft Mob Name Generator ===");
        System.out.print("How many mob names do you want to fogenerate? ");
        int count = sc.nextInt();

        System.out.println("\nGenerating " + count + " mob names...\n");

        for (int i = 1; i <= count; i++) {
            String prefix = prefixes[random.nextInt(prefixes.length)];
            String base = bases[random.nextInt(bases.length)];
            String suffix = suffixes[random.nextInt(suffixes.length)];

            // Randomly pick a pattern for variety
            int pattern = random.nextInt(3);
            String mobName;

            switch (pattern) {
                case 0:
                    mobName = prefix + " " + base;
                    break;
                case 1:
                    mobName = base + " " + suffix;
                    break;
                default:
                    mobName = prefix + " " + base + " " + suffix;
                    break;
            }

            System.out.println(i + ". " + mobName);
        }

        System.out.println("\n=== Generation Complete! ===");
    }
}
