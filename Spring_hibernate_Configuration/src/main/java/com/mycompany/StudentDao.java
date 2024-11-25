package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
@Transactional
public class StudentDao {

	@Autowired
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	public int insert(Student stud)
	{
		int i=(Integer)ht.save(stud);
		return i;
	}
}
