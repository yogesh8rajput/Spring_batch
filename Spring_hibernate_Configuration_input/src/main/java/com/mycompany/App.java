package com.mycompany;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
//        insert 
//        System.out.println("Enter Your Rollno");
//        int r=sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter Your Name");
//        String na=sc.nextLine();
//        System.out.println("Enter Your Percent");
//        double per=sc.nextDouble();
//        
//        
//        s.setId(r);
//        s.setName(na);
//        s.setPercent(per);
//        StudentDao sd=(StudentDao) con.getBean("studentDao");
//        int i=sd.insert(s);

//        System.out.println("Enter Your Rollno");
//        int r=sc.nextInt();
//        s.setId(r);
//        StudentDao sd=con.getBean("studentDao",StudentDao.class);
//    sd.delete(s);

//        Update the data 
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
		StudentDao sd = con.getBean("studentDao", StudentDao.class);
//		sd.update(s);
//		System.out.println("Update");
//		sc.close();

		List<Student> li=sd.select(s);
		for (Student st : li) {
			System.out.println("RollNo:"+st.getId());
			System.out.println("Name:"+st.getName());
			System.out.println("Percent"+st.getPercent());
		}
		
	}
}
