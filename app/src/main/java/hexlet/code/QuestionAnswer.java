package hexlet.code;

public final class QuestionAnswer {

        private final String question;
        private final String answer;

        public QuestionAnswer(String questionn, String answerr) {
            this.question = questionn;
            this.answer = answerr;
        }

        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }

}
