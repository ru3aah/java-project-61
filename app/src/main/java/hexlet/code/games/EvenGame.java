package hexlet.code.games;

import java.util.Random;

import static java.lang.System.out;

public class EvenGame {

    public static void greetMsg() {
        out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        out.println("Question: 15");
        out.println("Your answer should be: no");
        out.println(" ");
    }

    // generate random
    public static int genRnd() {
        Random random = new Random();
        return random.nextInt(100);
    }

    //define a correct answer
    public static String corAns(int rnd) {

        if ((rnd & 1) == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
    /* static String getUsrAnswer(String question) {
        //Asks question and gets usr answer
        Scanner ans = null;
        out.println("Question: " + question);
        out.print("Answer: ");
        return ans.next(in.toString()); //get usr answer
    }

     */

    /*public static boolean userFails(String inp, String usrName, String corAns) {

        out.println("'" + inp + "' is wrong answer :(. Correct answer was '" + corAns + "'");
        out.println("Let's try again, " + usrName);
        return false;
    }

     */

    /* public static boolean evenGame(String usrName) {

        greetMsg(); //std msg to usr in the begining


        for (int i = 0; i <= 2; i++) {

            String inp = null; //user input
            String corAns;//correct answer
            Random random = null;

            //generate new random int
            int rnd = random.nextInt(100);

            //define a correct answer
            if ((rnd & 1) ==0) {
                corAns = "yes";
            } else corAns = "no";

            //ask usr the question and get inp
            inp = getUsrAnswer(String.valueOf(rnd));

            // if            yes   &          even     or              no    &           odd
            if (inp.equals("yes") && ((rnd & 1) == 0) || (inp.equals("no") && ((rnd & 1) == 1)) ) {
                out.println("Correct!");
            } else { // answer is wrong
                return userFails(inp, usrName, corAns); //false  and get out to main
            }
        }
        out.println("Congratulations, " + usrName);
        return true;
    }

     */

