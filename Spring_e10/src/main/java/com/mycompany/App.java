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
       ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
       Employee e=(Employee)con.getBean("emp");
       System.out.println("City:"+e.getAddress1().getCity());
       System.out.println("State:"+e.getAddress1().getState());
    }
}
