package com.hibernates.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Answer {
    @Id
    private int answer_id;
    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;


    public int getAnswer_id() {
        return answer_id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer(int answer_id, String answer) {
        this.answer_id = answer_id;
        this.answer = answer;
    }
    public Answer(){
        super();
    }
}
