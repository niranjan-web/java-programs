package com.hibernate.MavenDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.AnswerEntity;
//import com.entity.EmployeeEntity;
import com.entity.QuestionEntity;

public class App {
    public static void main(String[] args) {

        try {
            Configuration config = new Configuration();
            config.configure();

            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();

            /*
             * EmployeeEntity obj = new EmployeeEntity( 100,"mark","south africa" );
             * obj.setEmployeeId(102); obj.setEmployeeName("logan");
             * obj.setEmployeeCity("usa");
             */
            QuestionEntity questionObj = new QuestionEntity();
            questionObj.setQ_id(1);
            questionObj.setQuestion("how you doing?");

            AnswerEntity answerObj = new AnswerEntity();
            answerObj.setA_id(1);
            answerObj.setAnswer("i'm good!");

            answerObj.setQuestion(questionObj);
            questionObj.setAnswerEntity(answerObj);

            session.saveOrUpdate(questionObj);
            session.saveOrUpdate(answerObj);

            Transaction transaction = session.beginTransaction();
            transaction.commit();

        } catch (Exception ex) {
            System.out.println("exception occured " + ex);
        }

    }
}
