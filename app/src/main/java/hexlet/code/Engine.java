package hexlet.code;

import hexlet.code.games.*;

import java.util.Objects;
import java.util.Scanner;

import static hexlet.code.games.CalcGame.Equation.getOp1;
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
            case (4) -> //NodGame
                    NodGame.greetMsg();
            case (5) -> //ProgressionGame
                    Progression.greetMsg();
        }
        //make turns
        String question = ""; // a string to be printed out after "Question: "
        String corAns = ""; // correct answer
        String usrAns = "";         // user's input
        Scanner ans = new Scanner(in);

        for(int i = 0; i <=2; i++) {
            //generate random question and define a correctAnswer
            switch (gameNum) {
                case (2) -> { //EvenGame
                    int rnd = EvenGame.genRnd();  //generate random value
                    corAns = EvenGame.corAns(rnd);  //define the correct answer
                    question = String.valueOf(rnd); //create question string
                }
                case (3) -> { //CalcGame
                    CalcGame.Equation rnd = CalcGame.getRnd();  //Generate new random equation
                    int op1 = getOp1(rnd);                      //get 1st operand
                    int op2 = CalcGame.Equation.getOp2(rnd);    //get 2nd operand
                    int res = CalcGame.Equation.getRes(rnd);    //get result
                    String opSymbol = CalcGame.Equation.getOpSym(rnd); //get op Symbol
                    corAns = String.valueOf(res);                   //convert res to String
                    question = op1 + opSymbol + op2;                //create question to ask
                }
                case (4) -> {//Nod Game
                    NodGame.Equation rnd = NodGame.getRnd(); //Generate values and calculate NOD
                    int val1 = NodGame.Equation.getVal1(rnd); //Get val 1 from equation
                    int val2 = NodGame.Equation.getVal2(rnd); //Get val 2 from equation
                    int nod = NodGame.Equation.getRes(rnd);   //Get NOD from equation
                    corAns = String.valueOf(nod);             //convert NOD to String
                    question = val1 + " and " + val2;         //create question to ask
                }
                case (5) -> { //Progression Game
                    Progression.Progres rnd = Progression.getRnd(); //Generate new Progression
                    corAns = String.valueOf(Progression.Progres.getHiddenVal(rnd)); //get correct Answer

                    //create a question String with progression and .. instead of hidden
                    question = "";
                    int tmp = 0;
                    for (int j = 0; j < Progression.Progres.getLen(rnd); j++) {
                        tmp = Progression.Progres.getFirstVal(rnd) + Progression.Progres.getStep(rnd) * j;
                        if (j == Progression.Progres.getHidden(rnd)) {
                            question = question + ".. ";
                        } else {
                        question = question + tmp + " ";
                        }
                    }
                }
                case (6) -> {//Prime Game
                    int rnd = PrimeGame.getRnd(); //generate random int
                    corAns = PrimeGame.corAns(rnd); //define the correct answer
                    question = String.valueOf(rnd); //create question string

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
            //if not kicked than then usrAnsw is correct - congrat and make next turn
                System.out.println("Correct!");
                System.out.println();
        }
        // all turns were successfull - congrat and get out
        System.out.println("Congratulations, " + usrName);
    }
}
