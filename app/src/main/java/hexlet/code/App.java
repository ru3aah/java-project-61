package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner gameNum = new Scanner(System.in);

        System.out.println("Please Enter the game number and press Enter,");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = gameNum.nextInt();
        if (choice == 1) {
            System.out.println("Welcome to the Brain Games!");
            String usrName = Cli.greeting();
        }
        else {
            System.out.println("Bye!");
        }
    }
}
