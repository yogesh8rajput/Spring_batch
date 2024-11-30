package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */   //Constructor
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
       Patient p=(Patient) con.getBean("patient1");
       System.out.println("Patient id:"+p.pno);
       System.out.println("Patient Name:"+p.bpressure);
       System.out.println("Blood pressuree:"+p.pname);
    }
}
