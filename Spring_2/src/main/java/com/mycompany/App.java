package com.mycompany;

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
       // System.out.println( "Hello World!" );
    	ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
    	Student s=(Student)con.getBean("stu1");
    	//System.out.println(s.getSkills()+":"+s.getProject()+":"+s.getMobile());
    	System.out.println(s.getSkills().getClass()+":"+s.getProject().getClass()+":"+s.getMobile().getClass());
    	   
    }
}
