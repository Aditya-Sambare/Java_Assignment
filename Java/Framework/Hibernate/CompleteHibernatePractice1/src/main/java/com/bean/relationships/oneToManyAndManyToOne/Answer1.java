package com.bean.relationships.oneToManyAndManyToOne;

import com.bean.relationships.oneToOne.Question;

import javax.persistence.*;

@Entity
public class Answer1 {
    @Id
    int answerId;
    String answer;
    @ManyToOne(cascade = CascadeType.ALL)
    Question1 question;

    public Answer1() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
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

    @Override
    public String toString() {
        return "Answer1{" +
                "answerId=" + answerId +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }
}
