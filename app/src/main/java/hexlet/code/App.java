package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NodGame;
import hexlet.code.games.Progression;

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
        String choice = gameNum.next();
        switch (choice) {
            case ("0") -> System.out.println("Good buy!");
            case ("1") -> {
                Cli.greeting();
                System.out.println("Good bye!");
            }
            case ("2") -> EvenGame.game();
            case ("3") -> CalcGame.game();
            case ("4") -> NodGame.game();
            case ("5") -> Progression.game();
            case ("6") -> PrimeGame.game();
            default -> System.out.println("Good_buy!");
        }
    }
}
