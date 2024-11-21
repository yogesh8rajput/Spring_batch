package com.mycompany;

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
       ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
       JdbcTemplate jt=(JdbcTemplate)con.getBean("my_jdbc",JdbcTemplate.class);
       
       System.out.println(jt);
    }
}
