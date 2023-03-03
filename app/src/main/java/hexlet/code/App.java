package hexlet.code;

import hexlet.code.games.*;
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
        out.println("4 - GCD");
        out.println("5 - Progression");
        out.println("6 - Prime");
        out.println("0 - Exit");
        out.print("Your choice: ");
        int choice = gameNum.nextInt();
        if (choice == 0) {
            out.println("Good buy!");
            return;
        }
        String usrName = Cli.greeting();
        switch (choice) {
            case (1) -> //Greeting
                System.out.println("Good bye!");
            case (2) -> //EvenGame
                Engine.gameEngine(EvenGame.game(), usrName);
            case (3) -> //CalcGame
                Engine.gameEngine(CalcGame.game(), usrName);
            case (4) -> //NodGame
                Engine.gameEngine(NodGame.game(), usrName);
            case (5) -> //ProgressionGame
                Engine.gameEngine(Progression.game(), usrName);
            case (6) -> //Prime Game
                Engine.gameEngine(PrimeGame.game(), usrName);
        }
    }
}