package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine.QuestionAnswer;
import hexlet.code.Engine.GameConst;
import hexlet.code.Engine;
import static java.lang.System.out;

public class EvenGame {

    public static final int RND_BOUND_EVEN = 100; //RND bound for Even

    public static int genRnd() {
        Random random = new Random();
        return random.nextInt(RND_BOUND_EVEN);
    }
    public static String corAns(int rnd) {

        if ((rnd % 2) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
    public static void game() {
        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        out.println("Question: 15");
        out.println("Your answer should be: no");
        out.println(" ");
        QuestionAnswer[] questionAnswer = new QuestionAnswer[GameConst.ROUND_QTY];
        for (int z = 0; z < GameConst.ROUND_QTY; z++) {
            int rnd = EvenGame.genRnd();
            questionAnswer[z].setAnswer(EvenGame.corAns(rnd));
            questionAnswer[z].setQuestion(String.valueOf(rnd));
        }
        Engine.gameEngine(questionAnswer);
    }
}


