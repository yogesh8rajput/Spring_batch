package com.mycompany;

import java.util.Scanner;

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
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
//        System.out.println("Enter Your Rollno");
//        int r=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter Your Name");
//        String na=sc.nextLine();
//        System.out.println("Enter Your Percent");
//        double per=sc.nextDouble();
//        
//        
//        s.setId(r);
//        s.setName(na);
//        s.setPercent(per);
//        StudentDao sd=con.getBean("studentDao",StudentDao.class);
//        int i=sd.insert(s);
        
        System.out.println("Enter Your Rollno");
        int r=sc.nextInt();
        s.setId(r);
        StudentDao sd=con.getBean("studentDao",StudentDao.class);
    sd.delete(s);
        
    }
}
