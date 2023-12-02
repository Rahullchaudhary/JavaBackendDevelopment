package com.springcore2.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore2/collections/config.xml/");
		Student student=(Student)con.getBean("student");
		System.out.println(student.getName());
		System.out.println(student.getPhones());
		System.out.println(student.getAddresses());
		System.out.println(student.getCourses());
	}

}
