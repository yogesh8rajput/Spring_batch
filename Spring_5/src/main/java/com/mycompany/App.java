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
       ApplicationContext con =new ClassPathXmlApplicationContext("config.xml");
       Test t=(Test) con.getBean("check");
       t.add();
    }
}
