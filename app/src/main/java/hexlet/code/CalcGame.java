package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class CalcGame {
    public static void calcGame(String userName){
    out.println("What is the result of the expression?");
    Random random = new Random();
    Scanner ans = new Scanner(System.in);


    for (int i = 0; i <= 2; i++){
        int op1 = random.nextInt(50);        //first operator
        int op2 = random.nextInt(50);        //second operator
        int operator = random.nextInt(3);    //operand
        String operatorChar;                        //operand character
        int res;                                    //result
        String usrAns;                              //user answer
        if (operator == 0) {
            operatorChar = "+";
            res = op1 + op2;
        } else if (operator == 1) {
            operatorChar = "-";
            res = op1 - op2;
        } else {
            operatorChar = "*";
            res = op1 * op2;
        }
        out.println("Question: " + op1 + operatorChar + op2);
        out.print("Your answer: ");
        usrAns = ans.next();
        if (usrAns.equals(Integer.toString(res))) {
            out.println("Correct!");
            out.println(" ");
        }else {
            out.println("'" + usrAns + "'" + "is wrong answer :(. Correct answer was '" + res + "'.");
            out.println("Let's try again, " + userName);
            return;
        }

    }
        out.println("Congratulations, " + userName);
    }
}
