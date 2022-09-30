package com.bean.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    int answerId;
    String answer;
    @OneToOne(mappedBy = "answer")
    Question question;

    public Answer() {
    }

    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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

//    @Override
//    public String toString() {
//        return "Answer1{" +
//                "answerId=" + answerId +
//                ", answer='" + answer + '\'' +
//                ", question=" + question +
//                '}';
//    }
}
