package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

import static java.lang.System.*;

public class App {
    public static void main(String[] args) {

        Scanner gameNum = new Scanner(in);

        out.println("Please Enter the game number and press Enter,");
        out.println("1 - Greet");
        out.println("2 - Even");
        out.println("3 - Calc");
        out.println("0 - Exit");
        out.print("Your choice: ");
        String usrName;
        int choice = gameNum.nextInt();
        if (choice == 1) {
            Cli.greeting();
        } else if (choice == 2) {
            usrName = Cli.greeting();
            EvenGame.evenGame(usrName);
        } else if (choice == 3) {
            usrName = Cli.greeting();
            CalcGame.calcGame(usrName);
        } else out.println("Bye!");
    }
}
