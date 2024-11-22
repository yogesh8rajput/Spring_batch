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
    {    ///This is the autowire= byName and byType 
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        Employee ad=(Employee)con.getBean("emp");
        System.out.println("City Name:"+ad.getAddress1().getCity());
        System.out.println("State Name:"+ad.getAddress1().getState());
    }
}
