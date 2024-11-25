package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con =new ClassPathXmlApplicationContext("config.xml");
        
        Student s=new Student();
        s.setId(1);
        s.setName("Ayush");
        s.setPercent(79.0);
        StudentDao sd=con.getBean("studentDao",StudentDao.class);
        int i=sd.insert(s);
        System.out.println("Done"+i);
    }
}
