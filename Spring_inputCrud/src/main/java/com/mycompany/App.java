package com.mycompany;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jt = (JdbcTemplate) con.getBean("my_jdbc", JdbcTemplate.class);

		System.out.println(jt);
		// insert data
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your Rollno");
//		int rollno=sc.nextInt();
//		 sc.nextLine();
//		System.out.println("Enter your Name");
//		String name=sc.nextLine();
//		System.out.println("Enter your Percentage");
//		double per=sc.nextDouble();
//		String query = "insert into student1(rollno,name,per) values(?,?,?)";
//
//		int i = jt.update(query, rollno, name, per);
//
//		System.out.println("Data inserted=" + i);
//		
		//delete data
//		System.out.println("Enter your Rollno");
//	     int rollno1=sc.nextInt();
//	     sc.nextLine();
//		String query = "delete from student1 where rollno=?";
//		
//			int i = jt.update(query,rollno1);
//		
//			System.out.println("delete" + i);
		
		//Update data
		System.out.println("Enter your Rollno");
	     int rollno1=sc.nextInt();
	     sc.nextLine();
	     System.out.println("Enter your Name");
	     String name=sc.nextLine();
		
		String query = "update student1 set name=? where rollno=?";
		
			int i = jt.update(query,name,rollno1);
		
			System.out.println("Update=" + i);
		
	}


    }

