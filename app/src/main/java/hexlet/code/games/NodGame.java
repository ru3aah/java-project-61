package hexlet.code.games;

import java.util.Random;

public class NodGame {

    //define a class for equation components
    public static class Equation {
        private final int value1;
        private final int value2;
        private final int nod;

        public Equation(int val1, int val2, int nodd) {
            this.value1 = val1;
            this.value2 = val2;
            this.nod = nodd;
        }

        //define getters for Equation class
        public static int getVal1(Equation equation) {
            return equation.value1;
        }

        public static int getVal2(Equation equation) {
            return equation.value2;
        }

        public static int getRes(Equation equation) {
            return equation.nod;
        }
    }

    //Greeting for Nod game
    public static void greetMsg() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    //Get new val 1&2 using random generator and calculate NOD for them
    public static Equation getRnd() {
        Random random = new Random();
        int val1 = random.nextInt(50);
        int val2 = random.nextInt(50);

        //calculate NOD using Evklid's method
        int a = val1;
        int b = val2;
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        int nod = a;
        return new Equation(val1, val2, nod);
    }

    public static String[][] game() {
        NodGame.greetMsg();
        String[][] questionAnswer = new String[2][3];
       for (int z = 0; z < 3; z++) {
           NodGame.Equation rnd = NodGame.getRnd();
           int val1 = NodGame.Equation.getVal1(rnd);
           int val2 = NodGame.Equation.getVal2(rnd);
           int nod = NodGame.Equation.getRes(rnd);
           questionAnswer[0][z] = val1 + " " + val2;
           questionAnswer[1][z] = String.valueOf(nod);
       }
        return questionAnswer;
    }
}
