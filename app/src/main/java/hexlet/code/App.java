package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NodGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class App {

    public static void main(String[] args) {
        Scanner gameNum = new Scanner(in);
        out.println("Please Enter the startGame number and press Enter,");
        out.println("1 - Greet");
        out.println("2 - Even");
        out.println("3 - Calc");
        out.println("4 - GCD");
        out.println("5 - Progression");
        out.println("6 - Prime");
        out.println("0 - Exit");
        out.print("Your choice: ");
        String choice = gameNum.next();
        switch (choice) {
            case ("0") -> System.out.println("Good buy!");
            case ("1") -> {
                Cli.greeting();
                Cli.getUsrName();
                System.out.println("Good bye!");
            }
            case ("2") -> EvenGame.startGame();
            case ("3") -> CalcGame.startGame();
            case ("4") -> NodGame.startGame();
            case ("5") -> ProgressionGame.startGame();
            case ("6") -> PrimeGame.startGame();
            default -> System.out.println("Sorry, something went wrong, "
                    + "shit happens, try again.");
        }
    }
}
