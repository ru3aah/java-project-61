package hexlet.code;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {

        Scanner gameNum = new Scanner(in);

        out.println("Please Enter the game number and press Enter,");
        out.println("1 - Greet");
        out.println("2 - Even");
        out.println("3 - Calc");
        out.println("4 - NOD");
        out.println("5 - Progression");
        out.println("0 - Exit");
        out.print("Your choice: ");
        String usrName;
        int choice = gameNum.nextInt();
        if (choice == 0) {
            out.println("Buy!");
            return;
        }
        usrName = Cli.greeting();
        Engine.gameEngine(choice, usrName);
    }
}
