package com.bean.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
    @Id
    int questionId;
    String question;
    @OneToOne
    Answer answer;

    public Question() {
    }

    public Question(int questionId, String question, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
//
//    @Override
//    public String toString() {
//        return "Question1{" +
//                "questionId=" + questionId +
//                ", question='" + question + '\'' +
//                ", answer=" + answer +
//                '}';
//    }
}
