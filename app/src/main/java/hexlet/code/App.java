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

    public static final class GameConst {
        public static final int ROUND_QTY = 3; //game turns limit
        public static final int RND_BOUND_CALC = 12; //upper bound for RND to avoid counting billions
        public static final int SIGN_BOUND_CALC = 3; //upper bound for RND for  op sign
        public static final int RND_BOUND_NOD = 50; //upper bound for RND in NOD game
        public static final int RND_ORIGN_PRIME = 1; //RND RANGE beginning
        public static final int RND_BOUND_PRIME = 1000; //RND RANGE BOUND
        public static final int RND_BOUND_START_PROGR = 100; //RND bound for progression first value
        public static final int RND_ORIGN_LEN_PROGR = 5; //RND orign for progression lenght
        public static final int RND_BOUND_LEN_PROGR = 11; //RND bound for progression lenght
        public static final int RND_ORIGN_STEP_PROGR = 1; //RND orign for progression step
        public static final int RND_BOUND_STEP_PROGR = 10; //RND bound for progression step
        public static final int RND_ORIGN_HID_POS_PROGR = 0; // RND orign for hidden position in progression
        public static final int RND_BOUND_EVEN = 100; //RND bound for Even

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
        String choice = gameNum.next();
        switch (choice) {
            case ("0") -> System.out.println("Good buy!");
            case ("1") -> {
                Cli.greeting();
                System.out.println("Good bye!");
            }
            case ("2") -> Engine.gameEngine(EvenGame.game(), Cli.greeting());
            case ("3") -> Engine.gameEngine(CalcGame.game(), Cli.greeting());
            case ("4") -> Engine.gameEngine(NodGame.game(), Cli.greeting());
            case ("5") -> Engine.gameEngine(Progression.game(), Cli.greeting());
            case ("6") -> Engine.gameEngine(PrimeGame.game(), Cli.greeting());
            default -> System.out.println("Good_buy!");
        }
    }
}
