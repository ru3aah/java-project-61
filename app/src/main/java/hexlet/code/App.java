package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class App {
    public static int roundQty =3; //rounds quantity in below games
    public static void main(String[] args) {
        Scanner gameNum = new Scanner(in);
        Integer roundQty = 3;
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
            case (3) -> Engine.gameEngine(CalcGame.game(), Cli.greeting());
            case (4) -> Engine.gameEngine(NodGame.game(), Cli.greeting());
            case (5) -> Engine.gameEngine(Progression.game(), Cli.greeting());
            case (6) -> Engine.gameEngine(PrimeGame.game(), Cli.greeting());
        }
    }
}