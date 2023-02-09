package hexlet.code.games;

import java.util.Random;

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
        int op1 = random.nextInt(12);        //first operand
        int op2 = random.nextInt(12);        //second operand
        int operator = random.nextInt(3);    //operator
        int res = 0;                               //result
        String operatorSym = null;                 //operator Symbol
        //define operator
        switch (operator) {
            case (0) -> {
                operatorSym = "+";
                res = op1 + op2;
            }
            case (1) -> {
                operatorSym = "-";
                res = op1 - op2;
            }
            case (2) -> {
                operatorSym = "*";
                res = op1 * op2;
            }

        }
        return new Equation(op1, op2, res, operatorSym);
    }
}
