package hexlet.code;

import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.in;

public class Engine {

    public static final int ROUND_QTY = 3; //startGame turns limit
    private static String greeting;
    private static QuestionAnswer[] questionAnswer;

    public static void handleGame(String greeting_, QuestionAnswer[] questionAnswer_) {
        Engine.greeting = greeting_;
        Engine.questionAnswer = questionAnswer_;
        Cli.greeting();
        String usrName = Cli.getUsrName();
        System.out.println(greeting);
        Scanner ans = new Scanner(in);
        for (int i = 0; i < ROUND_QTY; i++) {
            System.out.println("Question: " + questionAnswer[i].getQuestion());
            System.out.print("Answer: ");
            String usrAns = ans.next();
            if (!(Objects.equals(questionAnswer[i].getAnswer(), usrAns))) {
                System.out.println("'" + usrAns + "' is wrong answer :(. Correct answer was '"
                        + questionAnswer[i].getAnswer() + "'");
                System.out.println("Let's try again, " + usrName + "!");
                return;
            }
                System.out.println("Correct!" + "\n");
        }
        System.out.println("Congratulations, " + usrName + "!");
    }
}
