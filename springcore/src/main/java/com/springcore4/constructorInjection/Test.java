package com.springcore4.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore4/constructorInjection/config.xml");
		Person p=(Person)con.getBean("ci");
		System.out.println(p);
		
	}

}
