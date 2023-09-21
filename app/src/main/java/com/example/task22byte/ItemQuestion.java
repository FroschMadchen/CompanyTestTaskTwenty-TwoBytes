package com.example.task22byte;

public class ItemQuestion {
    String question;
    String answerN1;
    String answerN2;
    String answerN3;
    String answerN4;
    int answerCorrect;

    public ItemQuestion(String question, String answerN1, String answerN2, String answerN3, String answerN4, int answerCorrect) {
        this.question = question;
        this.answerN1 = answerN1;
        this.answerN2 = answerN2;
        this.answerN3 = answerN3;
        this.answerN4 = answerN4;
        this.answerCorrect = answerCorrect;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerN1() {
        return answerN1;
    }

    public String getAnswerN2() {
        return answerN2;
    }

    public String getAnswerN3() {
        return answerN3;
    }

    public String getAnswerN4() {
        return answerN4;
    }

    public int getAnswerCorrect() {
        return answerCorrect;
    }
}

