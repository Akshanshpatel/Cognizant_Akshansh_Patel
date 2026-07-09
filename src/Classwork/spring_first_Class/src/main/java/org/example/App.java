package org.example;

import org.example.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Setter based Injection!" );

//        SpringBoot use this ApplicationContext internally
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

//        we can either explicitly typeCast
//        Employee e= (Employee) ctx.getBean("emp1");

        Employee e=ctx.getBean("emp",Employee.class);

        System.out.println(e);


    }
}
