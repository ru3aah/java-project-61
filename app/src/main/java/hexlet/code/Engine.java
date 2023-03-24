package hexlet.code;

import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.in;

public class Engine {

    public static final class GameConst {
        public static final int ROUND_QTY = 3; //game turns limit
    }

    public static class QuestionAnswer {
        private String question;
        private String answer;

        public QuestionAnswer(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
    }
    public static void gameEngine(QuestionAnswer[] questionAnswer) {
        String usrName = Cli.greeting();
        Scanner ans = new Scanner(in);
        for (int i = 0; i < GameConst.ROUND_QTY; i++) {
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
