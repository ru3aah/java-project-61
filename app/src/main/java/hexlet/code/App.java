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
   private static int roundQty;
    public static int getRoundQty() {
        return roundQty;
    }
    static {
        roundQty = 3; //rounds qty in below games
    }
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
        switch (choice) {
            case (0) -> System.out.println("Good buy!");
            case (1) -> {
                Cli.greeting();
                System.out.println("Good bye!");
            }
            case (2) -> Engine.gameEngine(EvenGame.game(), Cli.greeting());
            case (3) -> Engine.gameEngine(CalcGame.game(), Cli.greeting()); //3
            case (4) -> Engine.gameEngine(NodGame.game(), Cli.greeting()); //4
            case (5) -> Engine.gameEngine(Progression.game(), Cli.greeting()); //5
            case (6) -> Engine.gameEngine(PrimeGame.game(), Cli.greeting());  //6
            default -> System.out.println("Good_buy!");
        }
    }
}
