package hexlet.code.games;

import java.util.Random;

public class Progression {

    public static class Progres {
        final private int firstVal; //first in raw
        final private int len; //progression length - 5 (5 is the least allowed)
        final private int step; //progression step
        final private int hidden; //hidden position
        final private int hiddenVal; //hidden value

        public Progres(int firstVal, int len, int step, int hidden, int hiddenVal) {
            this.firstVal = firstVal;
            this.len = len;
            this.step = step;
            this.hidden = hidden;
            this.hiddenVal =hiddenVal;
        }
        //Define getters for Progres class
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
    //generate new progression and randomly hide one figure in it
    public static Progres getRnd() {
        Random random = new Random();
        int firstVal = random.nextInt(100);
        int len = random.nextInt(5, 11); // 5 <= len < 11
        int step = random.nextInt(1, 10);
        int hidden = random.nextInt(0, len-1); // hidden position #
        int hiddenVal = firstVal + hidden * step; //hidden value at hidden position
        return new Progres(firstVal, len, step, hidden, hiddenVal);
    }

    //greeting msg for Progression Game
    public static void greetMsg() {System.out.println("Guess hidden figure");}

    public static String[][] game () {
        Progression.greetMsg();

        String[][] questionAnswer = new String[2][3];
        for (int z = 0; z < 3; z++) {
            Progression.Progres rnd = Progression.getRnd(); //Generate new Progression
            questionAnswer[1][z] = String.valueOf(Progression.Progres.getHiddenVal(rnd)); //get correct Answer

            //create a question String with progression and .. instead of hidden
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