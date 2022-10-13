package com.bean.relationships.oneToManyAndManyToOne;

import com.bean.relationships.oneToOne.Answer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question1 {
    @Id
    int questionId;
    String question;
    @OneToMany(cascade = CascadeType.ALL)
    List<Answer1> answer;

    public Question1() {
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

    public List<Answer1> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer1> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question1{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
