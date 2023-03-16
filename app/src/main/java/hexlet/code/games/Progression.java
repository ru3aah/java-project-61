package hexlet.code.games;

import java.util.Random;
import hexlet.code.App.GameConst;

public class Progression {
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
        int firstVal = random.nextInt(GameConst.RND_BOUND_START_PROGR);
        int len = random.nextInt(GameConst.RND_ORIGN_LEN_PROGR, GameConst.RND_BOUND_LEN_PROGR);
        int step = random.nextInt(GameConst.RND_ORIGN_STEP_PROGR, GameConst.RND_BOUND_STEP_PROGR);
        int hidden = random.nextInt(GameConst.RND_ORIGN_HID_POS_PROGR, len - 1);
        int hiddenVal = firstVal + hidden * step;
        return new Progres(firstVal, len, step, hidden, hiddenVal);
    }
    public static void greetMsg() {
        System.out.println("What number is missing in the progression");
    }
    public static String[][] game() {
        Progression.greetMsg();
        String[][] questionAnswer = new String[2][3];
        for (int z = 0; z < GameConst.ROUND_QTY; z++) {
            Progression.Progres rnd = Progression.getRnd(); //Generate new Progression
            questionAnswer[1][z] = String.valueOf(Progression.Progres.getHiddenVal(rnd)); //get correct Answer
            String question = "";
            int tmp = 0;
            for (int j = 0; j < Progression.Progres.getLen(rnd); j++) {
                tmp = Progression.Progres.getFirstVal(rnd) + Progression.Progres.getStep(rnd) * j;
                if (j == Progression.Progres.getHidden(rnd)) {
                    question = question + ".. ";
                } else {
                    question = question + tmp + " ";
                }
            }
            questionAnswer[0][z] = question;
        }
        return questionAnswer;
    }

}
