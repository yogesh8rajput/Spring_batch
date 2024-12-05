package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello w!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
       
       A a=(A) con.getBean("a1");
       System.out.println(a.getX()+":"+a.getBref().getY());
       
    }
}
