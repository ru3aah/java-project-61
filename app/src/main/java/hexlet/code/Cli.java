package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static String getUsrName() {
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String usrName = scan.next();
        System.out.println("Hello, " + usrName + "!");
        return usrName;
    }


}
