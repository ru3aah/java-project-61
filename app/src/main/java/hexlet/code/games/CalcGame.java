package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import java.util.Random;
import static hexlet.code.Engine.ROUND_QTY;

public class CalcGame {

    public static final int RND_BOUND_CALC = 12; //upper bound for RND to avoid counting billions
    public static final int SIGN_BOUND_CALC = 3; //upper bound for RND for op sign
    // define a class for equation components
    public static class Equation {
        private final int op1;
        private final int op2;
        private final int res;
        private final String opSymbol;

        public Equation() {
            Random random = new Random();
            this.op1 = random.nextInt(RND_BOUND_CALC);
            this.op2 = random.nextInt(RND_BOUND_CALC);
            int operator = random.nextInt(SIGN_BOUND_CALC);
            switch (operator) {
                case (0) -> {
                    this.opSymbol = " + ";
                    this.res = op1 + op2;
                }
                case (1) -> {
                    this.opSymbol = " - ";
                    this.res = op1 - op2;
                }
                case (2) -> {
                    this.opSymbol = " * ";
                    this.res = op1 * op2;
                }
                default -> {
                    this.opSymbol = " M ";
                    this.res = 0;
                }
            }
        }

        public static int getOp1(Equation equation) {

            return equation.op1;
        }

        public static int getOp2(Equation equation) {

            return equation.op2;
        }

        public static int getRes(Equation equation) {

            return equation.res;
        }
        
        public static String getOpSym(Equation equation) {

            return equation.opSymbol;
        }

    }

    public static String greetMsg() {
        return "What is the result of the expression?";
    }

    public static void game() {
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];
        for (int z = 0; z < ROUND_QTY; z++) {
            Equation rnd = new Equation();
            int op1 = Equation.getOp1(rnd);
            int op2 = Equation.getOp2(rnd);
            int res = Equation.getRes(rnd);
            String opSymbol = Equation.getOpSym(rnd);
            questionAnswer[z] = new QuestionAnswer((op1+opSymbol+op2), String.valueOf(res));
        }
        Engine.gameEngine(greetMsg(), questionAnswer);
    }
}


