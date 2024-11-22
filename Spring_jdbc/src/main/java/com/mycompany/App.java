package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jt = (JdbcTemplate) con.getBean("my_jdbc", JdbcTemplate.class);

		// System.out.println(jt);
		// insert data
		String query = "insert into student1(rollno,name,per) values(?,?,?)";

		int i = jt.update(query, 102, "lala", 123.3);

		System.out.println("no of row inserted=" + i);
		
//		delete data
//		String query = "delete from student1 where rollno=?";
//		
//			int i = jt.update(query,420);
//		
//			System.out.println("delete=" + i);
		
		//Update data
//		String query = "update student1 set per=? where rollno=?";
//		
//			int i = jt.update(query,20.0,101);
//		
//			System.out.println("Update=" + i);
		
	}
}
