package com.bean.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Question1 {
    @Id
    int questionID;
    String question;
    @OneToMany
    List<Answer1> answers;

    public Question1(int questionID, String question, List<Answer1> answers) {
        this.questionID = questionID;
        this.question = question;
        this.answers = answers;
    }

    public Question1() {
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer1> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer1> answers) {
        this.answers = answers;
    }
}
