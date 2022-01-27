package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name ="question")
public class QuestionEntity {

    @Id
    private int questionId;
    @Column
    private String question;

    @OneToOne
    @JoinColumn(name = "id")
    AnswerEntity answerEntity;

    public AnswerEntity getAnswerEntity() {
        return answerEntity;
    }

    public void setAnswerEntity(AnswerEntity answerEntity) {
        this.answerEntity = answerEntity;
    }

    public int getQ_id() {
        return questionId;
    }

    public void setQ_id(int q_id) {
        this.questionId = q_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public QuestionEntity(int q_id, String question) {
        super();
        this.questionId = q_id;
        this.question = question;
    }

    public QuestionEntity() {
        super();

    }

    @Override
    public String toString() {
        return "QuestionEntity [q_id=" + questionId + ", question=" + question + ", answerEntity=" + answerEntity + "]";
    }
    
    

}
