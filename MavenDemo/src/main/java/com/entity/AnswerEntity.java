package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "answer")
public class AnswerEntity {

    @Id
    private int answerId;
    @Column
    private String answer;

    @OneToOne(mappedBy = "answerEntity")
    QuestionEntity question;

    public int getA_id() {
        return answerId;
    }

    public void setA_id(int a_id) {
        this.answerId = a_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionEntity getQuestion() {
        return question;
    }

    public void setQuestion(QuestionEntity question) {
        this.question = question;
    }

    public AnswerEntity(int a_id, String answer, QuestionEntity question) {
        super();
        this.answerId = a_id;
        this.answer = answer;
        this.question = question;
    }

    public AnswerEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "AnswerEntity [a_id=" + answerId + ", answer=" + answer + ", question=" + question + "]";
    }
    
    
}
   

    