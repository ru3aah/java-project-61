package hexlet.code.games;

import java.util.Random;
import hexlet.code.App.GameConst;

import static java.lang.System.out;

public class EvenGame {
    public static void greetMsg() {
        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        out.println("Question: 15");
        out.println("Your answer should be: no");
        out.println(" ");
    }
     public static int genRnd() {
        Random random = new Random();
        return random.nextInt(GameConst.RND_BOUND_EVEN);
    }

    public static String corAns(int rnd) {

        if ((rnd & 1) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static String[][] game() {
        EvenGame.greetMsg();
        String[][] questionAnswer = new String[2][GameConst.ROUND_QTY];
        for (int z = 0; z < GameConst.ROUND_QTY; z++) {
            int rnd = EvenGame.genRnd();
            questionAnswer[1][z] = EvenGame.corAns(rnd);
            questionAnswer[0][z] = String.valueOf(rnd);
        }
        return questionAnswer;
    }
}


