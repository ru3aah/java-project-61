package hexlet.code.games;

import java.util.Random;
import hexlet.code.QuestionAnswer;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUND_QTY;

public class Progression {

    public static final int RND_BOUND_START_PROGR = 100; //RND bound for progression first value
    public static final int RND_ORIGN_LEN_PROGR = 5; //RND orign for progression lenght
    public static final int RND_BOUND_LEN_PROGR = 11; //RND bound for progression lenght
    public static final int RND_ORIGN_STEP_PROGR = 1; //RND orign for progression step
    public static final int RND_BOUND_STEP_PROGR = 10; //RND bound for progression step
    public static final int RND_ORIGN_HID_POS_PROGR = 0; // RND orign for hidden position in progression
    public static class Progres {
        private final int firstVal;
        private final int len;
        private final int step;
        private final int hidden;
        private final int hiddenVal;

        public Progres(int firstVall, int lenn, int stepp, int hiddenn, int hiddenVall) {
            this.firstVal = firstVall;
            this.len = lenn;
            this.step = stepp;
            this.hidden = hiddenn;
            this.hiddenVal = hiddenVall;
        }

        public static int getFirstVal(Progres progres) {
            return progres.firstVal;
        }
        public static int getLen(Progres progres) {
            return progres.len;
        }
        public static int getStep(Progres progres) {
            return progres.step;
        }
        public static int getHidden(Progres progres) {
            return progres.hidden;
        }
        public static int getHiddenVal(Progres progres) {
            return progres.hiddenVal; }
    }
    public static Progres getRnd() {
        Random random = new Random();
        int firstVal = random.nextInt(RND_BOUND_START_PROGR);
        int len = random.nextInt(RND_ORIGN_LEN_PROGR, RND_BOUND_LEN_PROGR);
        int step = random.nextInt(RND_ORIGN_STEP_PROGR, RND_BOUND_STEP_PROGR);
        int hidden = random.nextInt(RND_ORIGN_HID_POS_PROGR, len - 1);
        int hiddenVal = firstVal + hidden * step;
        return new Progres(firstVal, len, step, hidden, hiddenVal);
    }
    public static String greetMsg() {
        return "What number is missing in the progression";
    }
    public static void game() {
        Progression.greetMsg();
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];

        for (int z = 0; z < ROUND_QTY; z++) {
            Progression.Progres rnd = Progression.getRnd(); //Generate new Progression

            String question = "";
            int tmp;
            for (int j = 0; j < Progression.Progres.getLen(rnd); j++) {
                tmp = Progression.Progres.getFirstVal(rnd) + Progression.Progres.getStep(rnd) * j;
                if (j == Progression.Progres.getHidden(rnd)) {
                    question = question + ".. ";
                } else {
                    question = question + tmp + " ";
                }
            }
            questionAnswer[z] = new QuestionAnswer(question, String.valueOf(Progression.Progres.getHiddenVal(rnd)) );
        }
        Engine.gameEngine(greetMsg(), questionAnswer);
    }
}
