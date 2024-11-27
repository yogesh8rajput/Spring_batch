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
//        s.setId(1);
//        s.setName("Ayush");
//        s.setPercent(79.0);
//        StudentDao sd=con.getBean("studentDao",StudentDao.class);
//        int i=sd.insert(s);
//        System.out.println("Done"+i)
        		
        s.setId(101);
        StudentDao sd=con.getBean("studentDao",StudentDao.class);
        sd.delete(s);
        
//      Update the data 
//		System.out.println("Enter Your Rollno");
//		int r = sc.nextInt();
//		sc.nextLine();
//		System.out.print("Enter new name: ");
//		String name = sc.nextLine();
//		System.out.print("Enter new per: ");
//		double per = sc.nextDouble();
//		s.setId(r);
//		s.setName(name);
//		s.setPercent(per);
//		StudentDao sd = con.getBean("studentDao", StudentDao.class);
//		sd.update(s);
//		System.out.println("Update");
//		sc.close();
    }
}
