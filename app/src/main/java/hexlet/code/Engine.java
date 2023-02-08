package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;


import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;


public class Engine {

    public static void gameEngine(int gameNum, String usrName) {

        //Greeting msg

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
        String usrAns;         // user's answer
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
                    int res = CalcGame.getRnd().res;
                    corAns = String.valueOf(res);
                    question = CalcGame.getRnd().op1 + CalcGame.getRnd().opSymbol + CalcGame.getRnd().op2;
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
                System.out.println("Correct!");
                System.out.println();
        }    //true - once again
        System.out.println("Congratulations, " + usrName);
    }
}
