package org.example;

import org.example.entity.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Hibernate!" );

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory= cfg.buildSessionFactory();

        Session session=factory.openSession();

        Transaction t= session.beginTransaction();

//        Employees e1=new Employees();
//        e1.setName("Akshansh");
//        e1.setEmail("akshanshpatel003@gmail.com");
//        e1.setId(1L);

//        we cannot directly set --> will give error

        Employees e1=session.find(Employees.class,1L);

        if(e1!=null){
            e1.setEmail("akshanshpatel125@gmail.com");
        }


        session.persist(e1);
        t.commit();

        session.close();
        factory.close();

    }

//    flow--> Configuration--Session Factory-- Session-- Transaction
}
