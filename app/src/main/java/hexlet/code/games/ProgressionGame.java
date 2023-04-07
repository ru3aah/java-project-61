package hexlet.code.games;

import java.util.Random;
import hexlet.code.QuestionAnswer;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUND_QTY;

public class ProgressionGame {
    public static final int RND_BOUND_START_PROGR = 100; //RND bound for progression first value
    public static final int RND_ORIGN_LEN_PROGR = 5; //RND orign for progression lenght
    public static final int RND_BOUND_LEN_PROGR = 11; //RND bound for progression lenght
    public static final int RND_ORIGN_STEP_PROGR = 1; //RND orign for progression step
    public static final int RND_BOUND_STEP_PROGR = 10; //RND bound for progression step
    public static final int RND_ORIGN_HID_POS_PROGR = 0; // RND orign for hidden position in progression

    public static class Progression {
        private final int firstVal;
        private final int len;
        private final int step;
        private final int hidden;
        private final int hiddenVal;

        public Progression() {
            Random random = new Random();
            this.firstVal = random.nextInt(RND_BOUND_START_PROGR);
            this.len = random.nextInt(RND_ORIGN_LEN_PROGR, RND_BOUND_LEN_PROGR);
            this.step = random.nextInt(RND_ORIGN_STEP_PROGR, RND_BOUND_STEP_PROGR);
            this.hidden = random.nextInt(RND_ORIGN_HID_POS_PROGR, len - 1);
            this.hiddenVal = firstVal + hidden * step;
        }

        public final String getStringOfProgression() {
            StringBuilder question = new StringBuilder("");
            int tmp;
            for (int j = 0; j < this.len; j++) {
                tmp = this.firstVal + this.step * j;
                if (j == this.hidden) {
                    question.append(".. ");
                } else {
                    question.append(tmp + " ");
                }
            }
            return String.valueOf(question);
        }
        public final int getHiddenVal() {
            return this.hiddenVal;
        }
    }

    public static String taskMsg() {
        return "What number is missing in the progression";
    }
    public static void startGame() {
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];

        for (int z = 0; z < ROUND_QTY; z++) {
            ProgressionGame.Progression rnd = new Progression(); //Generate new Progression
            questionAnswer[z] =
                    new QuestionAnswer(rnd.getStringOfProgression(),
                            String.valueOf(rnd.getHiddenVal()));
        }
        Engine.handleGame(taskMsg(), questionAnswer);
    }
}
