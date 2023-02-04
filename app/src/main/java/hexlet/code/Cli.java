package hexlet.code;
import java.util.Scanner;

import static java.lang.System.*;

public class Cli {

    public static String greeting() {
        Scanner scan = new Scanner(in);
        out.println("Welcome to the Brain Games!");
        out.print("May I have your name? ");
        String usrName = scan.next();
        out.println("Hello, " + usrName + "!");
        return usrName;
    }

}
