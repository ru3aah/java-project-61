package hexlet.code.games;

import java.util.Random;

import hexlet.code.QuestionAnswer;
import hexlet.code.Engine;

import static hexlet.code.Engine.ROUND_QTY;

public class EvenGame {

    public static final int RND_BOUND_EVEN = 100; //RND bound for Even

   public static String greetingMsg() {
       String s = "Answer 'yes' if the number is even, otherwise answer 'no'.";
       return s;
   }

    public static int genRnd() {
        Random random = new Random();
        return random.nextInt(RND_BOUND_EVEN);
    }

    public static boolean isEven(int num) {
        return  ((num % 2) == 0);
    }

    public static String corAns(int num) {
        return isEven(num) ? "yes" : "no";
    }

    public static void startGame() {
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];
        for (int z = 0; z < ROUND_QTY; z++) {
            int rnd = EvenGame.genRnd();
            questionAnswer[z] = new QuestionAnswer(String.valueOf(rnd), EvenGame.corAns(rnd));
        }
        Engine.gameEngine(greetingMsg(), questionAnswer);
    }
}


