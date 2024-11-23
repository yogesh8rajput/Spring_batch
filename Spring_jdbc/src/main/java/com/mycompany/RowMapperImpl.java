package com.mycompany;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setRollno(rs.getInt("rollno"));
		s.setName(rs.getString("name"));
		s.setPer(rs.getDouble("per"));
		return s;
		
	}

	
	
}
