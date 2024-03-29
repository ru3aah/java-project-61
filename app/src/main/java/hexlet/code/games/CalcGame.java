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
        private int res;
        private String opSymbol;

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
                    System.out.print("Something went wrong. Eject! Eject! Eject!");
                    System.exit(1);
                }
            }

        }

        public final String getEquationAsString() {
            return this.op1 + this.opSymbol + this.op2;
        }

        public  final String getEquationResult() {
            return String.valueOf(this.res);
        }
    }

    public static String taskMsg() {
        return "What is the result of the expression?";
    }

    public static void startGame() {
        QuestionAnswer[] questionAnswer = new QuestionAnswer[ROUND_QTY];
        for (int z = 0; z < ROUND_QTY; z++) {
            Equation rnd = new Equation();
            questionAnswer[z] = new QuestionAnswer(rnd.getEquationAsString(),
                    rnd.getEquationResult());
        }
        Engine.handleGame(taskMsg(), questionAnswer);
    }
}


