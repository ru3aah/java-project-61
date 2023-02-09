package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Objects;
import java.util.Scanner;

import static hexlet.code.games.CalcGame.Equation.*;
import static java.lang.System.in;


public class Engine {

    public static void gameEngine(int gameNum, String usrName) {

        //Display Greeting msg
        switch (gameNum) {
            case (1) -> //Greeting
            {
                System.out.println("Bye!");
                return;
            }
            case (2) -> //EvenGame
                    EvenGame.greetMsg();
            case (3) -> //CalcGame
                    CalcGame.greetMsg();
        }
        //make turns
        String question = null; // a string to be printed out after "Question: "
        String corAns =  null; // correct answer
        String usrAns;         // user's input
        Scanner ans = new Scanner(in);

        for(int i = 0; i <=2; i++) {
            //generate random question and define a correctAnswer
            switch (gameNum) {
                case (2) -> { //EvenGame
                    int rnd = EvenGame.genRnd();
                    corAns = EvenGame.corAns(rnd);
                    question = String.valueOf(rnd);
                }
                case (3) -> { //CalcGame
                    CalcGame.Equation rnd = CalcGame.getRnd();  //Generate new random equation
                    int op1 = getOp1(rnd);
                    int op2 = CalcGame.Equation.getOp2(rnd);
                    int res = CalcGame.Equation.getRes(rnd);
                    String opSymbol = CalcGame.Equation.getOpSym(rnd);
                    corAns = String.valueOf(res);
                    question = op1 + opSymbol + op2;
                }
            }
            //ask a question
            System.out.println("Question: " + question);

            //get usr answer
            System.out.print("Answer: ");
            usrAns = ans.next();

            //assess if answer is true or false
            if (!(Objects.equals(corAns, usrAns))) {

                //false --> kick out msg

                System.out.println("'" + usrAns + "' is wrong answer :(. Correct answer was '" + corAns + "'");
                System.out.println("Let's try again, " + usrName);
                return;
            }
            //if not kicked out than then usrAnsw is correct - congrat and make next turn
                System.out.println("Correct!");
                System.out.println();
        }
        // all turns successfull - congrat and get out
        System.out.println("Congratulations, " + usrName);
    }
}
