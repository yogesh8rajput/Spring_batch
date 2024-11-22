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
        ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
      //  Docter d=(Docter) con.getBean(Docter.class);
        Docter d=(Docter) con.getBean("docter");
        System.out.println("D_Id:"+d.getD_id());
        System.out.println("D_Name:"+d.getD_name());
        System.out.println("D_Profession:"+d.getD_profession());
        
        Docter2 d2=(Docter2) con.getBean("d1");
        System.out.println(d2);
    }
}
