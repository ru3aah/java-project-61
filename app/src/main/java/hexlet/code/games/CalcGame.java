package hexlet.code.games;

import java.util.Random;

import static java.lang.System.out;


public class CalcGame {

    public static class Equation {
        public int op1;
        public int op2;
        public int res;
        public String opSymbol;

        public Equation (int op1, int op2, int res, String opSymbol) {
            this.op1 = op1;
            this.op2 = op2;
            this.opSymbol = opSymbol;
            this.res = res;
        }
    }

    public static void greetMsg() {
        out.println("What is the result of the expression?");
    }

    public static Equation getRnd() {

        Random random = new Random();
        int op1 = random.nextInt(12);        //first operand
        int op2 = random.nextInt(12);        //second operand
        int operator = random.nextInt(3);    //operator
        int res = 0;                               //result
        String operatorSym = null;                 //operator Symbol
        switch (operator) {
            case (0) -> {
                operatorSym = "+";
                res = op1 + op2;
            }
            case (1) -> {
                operatorSym = "-";
                res = op1 - op2;
            }
            case (2) -> operatorSym = "*";
        }
        return new Equation(op1, op2, res, operatorSym);
    }
}
