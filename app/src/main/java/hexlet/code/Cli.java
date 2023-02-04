package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static String greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String usrName = scan.next();
        System.out.println("Hello, " + usrName + "!");
        return usrName;
    }

}
