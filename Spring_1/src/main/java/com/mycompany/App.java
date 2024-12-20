package com.mycompany;

import java.applet.AppletContext;


import org.springframework.cglib.proxy.Factory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      //Studen 1
        Student s = (Student) context.getBean("student");
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Percentage: " +s.getPerc());
        //Student 2
        Student s1 = (Student) context.getBean("student1");
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Percentage: " +s1.getPerc());
        //Student 3
        Student s2 = (Student) context.getBean("student2");
        System.out.println("Student ID: " + s2.getId());
        System.out.println("Student Name: " + s2.getName());
        System.out.println("Student Percentage: " +s2.getPerc());
    }

    
}
