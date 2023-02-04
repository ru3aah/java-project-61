package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class EvenGame {
    public static void evenGame(String usrName) {

        Scanner ans = new Scanner(in);

        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        out.println("Question: 15");
        out.println("Your answer: no");
        out.println(" ");
        Random random = new Random();

        for (int i = 0; i <= 2; i++) {
            String inp; //user input
            String corAns;//correct answer
            int rnd = random.nextInt(100);//generate new random int
            if ((rnd & 1) ==0) {
                corAns = "yes";
            } else corAns = "no";

            //now we know the correct answer

            out.println("Question: " + rnd);
            out.print("Answer: ");
            inp = ans.next(); //get an answer
            // if            yes   &          even     or              no    &           odd
            if ( inp.equals("yes") && ((rnd & 1) == 0) || (inp.equals("no") && ((rnd & 1) == 1)) ) {
                out.println("Correct!");
            } else { // answer is wrong
                out.println("'" + inp + "' is wrong answer :(. Correct answer was '" + corAns + "'");
                out.println("Let's try again, " + usrName);
                return; //get out to main
            }
        }
        out.println("Congratulations, " + usrName);
    }
}
