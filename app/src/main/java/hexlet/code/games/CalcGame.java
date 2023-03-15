package hexlet.code.games;
import java.util.Random;

import static hexlet.code.games.CalcGame.Equation.getOp1;
import static java.lang.System.out;
public class CalcGame {

    // define a class for equation components
    public static class Equation {
        final private int op1; //1st operand
        final private int op2; //2nd operand
        final private int res; //operation result
        final private String opSymbol; // operator

        public Equation (int op1, int op2, int res, String opSymbol) {
            this.op1 = op1;
            this.op2 = op2;
            this.res = res;
            this.opSymbol = opSymbol;
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
        int op1 = random.nextInt(12);
        int op2 = random.nextInt(12);
        int operator = random.nextInt(3);
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

        }
        return new Equation(op1, op2, res, operatorSym);
    }

    public static String[][] game() {
        CalcGame.greetMsg();
        String[][] questionAnswer = new String[2][3];
        for (int z = 0; z < 3; z++) {
            CalcGame.Equation rnd = CalcGame.getRnd();  //Generate new random equation
            int op1 = CalcGame.Equation.getOp1(rnd);    //get 1st operand
            int op2 = CalcGame.Equation.getOp2(rnd);    //get 2nd operand
            int res = CalcGame.Equation.getRes(rnd);    //get result
            String opSymbol = CalcGame.Equation.getOpSym(rnd); //get op Symbol
            questionAnswer[1][z] = String.valueOf(res);     //convert res to String
            questionAnswer[0][z] = op1 + opSymbol + op2;    //create question to ask
        }
        return questionAnswer;
    }
}


