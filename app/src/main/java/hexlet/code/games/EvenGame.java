package hexlet.code.games;

import java.util.Random;

import static java.lang.System.out;

public class EvenGame {

    public static void greetMsg() {
        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        out.println("Question: 15");
        out.println("Your answer should be: no");
        out.println(" ");
    }

    // generate random
    public static int genRnd() {
        Random random = new Random();
        return random.nextInt(100);
    }

    //define a correct answer
    public static String corAns(int rnd) {

        if ((rnd & 1) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}


