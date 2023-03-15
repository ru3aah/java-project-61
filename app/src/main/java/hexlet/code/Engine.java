package hexlet.code;

import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.in;

public class Engine {

    public static void gameEngine(String[][] questionAnswer, String usrName) {
        Scanner ans = new Scanner(in);
        for(int i = 0; i < App.getRoundQty(); i++) {
            System.out.println("Question: " + questionAnswer[0][i]);
            System.out.print("Answer: ");
            String usrAns = ans.next();
            if (!(Objects.equals(questionAnswer[1][i], usrAns))) {
                System.out.println("'" + usrAns + "' is wrong answer :(. Correct answer was '"
                        + questionAnswer[1][i] + "'");
                System.out.println("Let's try again, " + usrName + "!");
                return;
            }
                System.out.println("Correct!");
                System.out.println();
        }
        System.out.println("Congratulations, " + usrName + "!");
    }
}
