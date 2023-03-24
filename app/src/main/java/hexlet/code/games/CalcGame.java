package hexlet.code.games;

import hexlet.code.Engine.GameConst;

import java.util.Random;

import static java.lang.System.out;
public class CalcGame {

    public static final int RND_BOUND_CALC = 12; //upper bound for RND to avoid counting billions
    public static final int SIGN_BOUND_CALC = 3; //upper bound for RND for  op sign
    // define a class for equation components
    public static class Equation {
       private final int op1;
        private final int op2;
        private final int res;
        private final String opSymbol;

        public Equation(int opp1, int opp2, int ress, String opSymboll) {
            this.op1 = opp1;
            this.op2 = opp2;
            this.res = ress;
            this.opSymbol = opSymboll;
        }
        //Define getters for Equation class
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
//Greeting for Calculator Game
    public static void greetMsg() {
        out.println("What is the result of the expression?");
    }

    //get new equation using random generator
    public static Equation getRnd() {
        Random random = new Random();
        int op1 = random.nextInt(RND_BOUND_CALC);
        int op2 = random.nextInt(RND_BOUND_CALC);
        int operator = random.nextInt(SIGN_BOUND_CALC);
        int res = 0;
        String operatorSym = null;
        //define operator
        switch (operator) {
            case (0) -> {
                operatorSym = " + ";
                res = op1 + op2;
            }
            case (1) -> {
                operatorSym = " - ";
                res = op1 - op2;
            }
            case (2) -> {
                operatorSym = " * ";
                res = op1 * op2;
            }
            default -> {
                operatorSym = " M ";
                res = 0;
            }
        }
        return new Equation(op1, op2, res, operatorSym);
    }
    public static String[][] game() {
        CalcGame.greetMsg();
        String[][] questionAnswer = new String[2][GameConst.ROUND_QTY];
        for (int z = 0; z < GameConst.ROUND_QTY; z++) {
            CalcGame.Equation rnd = CalcGame.getRnd();
            int op1 = CalcGame.Equation.getOp1(rnd);
            int op2 = CalcGame.Equation.getOp2(rnd);
            int res = CalcGame.Equation.getRes(rnd);
            String opSymbol = CalcGame.Equation.getOpSym(rnd);
            questionAnswer[1][z] = String.valueOf(res);
            questionAnswer[0][z] = op1 + opSymbol + op2;
        }
        return questionAnswer;
    }
}


