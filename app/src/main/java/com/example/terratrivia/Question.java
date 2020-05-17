package com.example.terratrivia;

public class Question {

    private String question;
    private String answer;
    private String option1, option2, option3;

    public Question(String requiredQuestion, String requiredAnswer, String requiredOption1, String requiredOption2, String requiredOption3) {
        question = requiredQuestion;
        answer = requiredAnswer;
        option1 = requiredOption1;
        option2 = requiredOption2;
        option3 = requiredOption3;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOption1() { return option1; }

    public String getOption2() { return option2; }

    public String getOption3() { return option3; }
}
