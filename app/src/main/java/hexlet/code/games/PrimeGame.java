package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;

import static hexlet.code.Engine.ROUND_QTY;

public class PrimeGame {

    public static final int RND_ORIGN_PRIME = 1; //RND RANGE beginning
    public static final int RND_BOUND_PRIME = 1000; //RND RANGE BOUND

    public static String greetMsg() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static int getRnd() {
        Random random = new Random();
        return random.nextInt(RND_ORIGN_PRIME, RND_BOUND_PRIME);
    }

    public static String corAns(int rnd) {
        int tmp;
        for (int j = 2; j <= rnd / 2;  j++) {
            tmp = rnd % j;
            if (tmp == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static void game() {
        greetMsg();
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];

        for (int z = 0; z < ROUND_QTY; z++) {
            int rnd = PrimeGame.getRnd();
            questionAnswer[z] = new QuestionAnswer(String.valueOf(rnd), corAns(rnd));
        }
        Engine.gameEngine(greetMsg(), questionAnswer);
    }
}
