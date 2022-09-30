package com.bean.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
    @Id
    int answerID;
    String answer;
    @ManyToOne
    Question1 question;

    public Answer1() {
    }

    public Answer1(int answerID, String answer, Question1 question) {
        this.answerID = answerID;
        this.answer = answer;
        this.question = question;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question1 getQuestion() {
        return question;
    }

    public void setQuestion(Question1 question) {
        this.question = question;
    }
}
