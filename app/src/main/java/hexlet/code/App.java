package hexlet.code;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner gameNum = new Scanner(System.in);

        System.out.println("Please Enter the game number and press Enter,");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
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
        } else System.out.println("Bye!");
    }
}
