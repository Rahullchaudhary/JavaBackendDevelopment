package com.springcore1;

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
        System.out.println( "Project Started....\n" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore1/config.xml");
        Student student=(Student)context.getBean("student1");
        System.out.println(student);
    }
}
