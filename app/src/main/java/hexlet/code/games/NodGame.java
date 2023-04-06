package hexlet.code.games;

import java.util.Random;
import hexlet.code.QuestionAnswer;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUND_QTY;

public class NodGame {

    public static final int RND_BOUND_NOD = 50; //upper bound for RND in NOD startGame

    public static String greetMsg() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static int getNod(int val1, int val2) {
            //calculate NOD using Evklid's method
        while (val2 != 0) {
            int tmp = val1 % val2;
            val1 = val2;
            val2 = tmp;
        }
        return val1;
    }

    public static void startGame() {
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];
        Random rnd = new Random();
       for (int z = 0; z < ROUND_QTY; z++) {
           int val1 = rnd.nextInt(RND_BOUND_NOD);
           int val2 = rnd.nextInt(RND_BOUND_NOD);
           int nod = getNod(val1, val2);
           questionAnswer[z] = new QuestionAnswer((val1 + " " + val2),
                   String.valueOf(nod));
       }
        Engine.gameEngine(greetMsg(), questionAnswer);
    }
}
