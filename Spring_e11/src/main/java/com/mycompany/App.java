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
           
        PersonSet ps=(PersonSet) con.getBean("perSet");
        System.out.println(ps.getName());
        System.out.println(ps.getName().getClass());
        PersonList pl=(PersonList)con.getBean("perList");
        System.out.println(pl.getName());
        System.out.println(pl.getName().getClass());
        PersonMap pm=(PersonMap) con.getBean("perMap");
        System.out.println(pm.getName());
        System.out.println(pm.getName().getClass());
    }
}
