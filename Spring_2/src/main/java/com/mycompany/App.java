package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 * //
 */ // LIST, SET AND MAP

public class App {
	public static void main(String[] args) {
		// Your output
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student) con.getBean("stu1");
		System.out.println(s.getSkills());
		System.out.println(s.getMobile());
		System.out.println(s.getProject());

		// Check type
		System.out.println(s.getSkills().getClass());
		System.out.println(s.getMobile().getClass());
		System.out.println(s.getProject().getClass());

	}
}
