package com.hibernates.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("file:src/main/java/com/hibernates/OneToOne/hibernate.cfg.xml").buildSessionFactory();
        Answer ans = new Answer(12,"Java is a programming language");
        Question question = new Question(1,"What is java?",ans);
        ans.setQuestion(question);
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(question);
        session.save(ans);

        session.getTransaction().commit();

        Answer answer = (Answer)session.load(Answer.class,12);

        System.out.println(answer.getQuestion().getQuestion());
        session.close();
        factory.close();
    }
}
