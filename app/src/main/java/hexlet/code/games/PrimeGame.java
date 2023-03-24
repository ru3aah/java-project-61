package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine.GameConst;

public class PrimeGame {

    public static final int RND_ORIGN_PRIME = 1; //RND RANGE beginning
    public static final int RND_BOUND_PRIME = 1000; //RND RANGE BOUND

    public static void greetMsg() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println(" ");
    }

    public static int getRnd() {
        Random random = new Random();
        return random.nextInt(RND_ORIGN_PRIME, RND_BOUND_PRIME);
    }

    public static String corAns(int rnd) {
        int tmp = 0;
        for (int j = 2; j <= rnd / 2;  j++) {
            tmp = rnd % j;
            if (tmp == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static String[][] game() {
        greetMsg();
        String[][] questionAnswer = new String[2][GameConst.ROUND_QTY];
        for (int z = 0; z < GameConst.ROUND_QTY; z++) {
            int rnd = PrimeGame.getRnd();
            questionAnswer[1][z] = corAns(rnd);
            questionAnswer[0][z] = String.valueOf(rnd);
        }
        return questionAnswer;
    }
}
