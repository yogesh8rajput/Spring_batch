package com.mycompany;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
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
	
	public int insert(Student st)
	{
		int i=(Integer)ht.save(st);
		return i;
	}
	
	public void delete (Student st)
	{
		ht.delete(st);
		
	}
	
}
