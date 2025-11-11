package programs.yourprogram;

import java.util.Scanner;
import ProgramInterface;

// 🧩 TEMPLATE: Copy this to your own folder and modify values.
public class Programnijose implements ProgramInterface {

    public String getName() { return "Minecraft Mob Name Generator"; }
    public String getDescription() { return "My Program is about a minecraft mob name generator"; }
    public String getAuthor() { return "Jose Cortez"; }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! This is your custom program.");
        // Add your logic here
    }
}
