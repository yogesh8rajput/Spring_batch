package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	  @Autowired  // This annanotation use in by Type
	   
	  // @Qualifier(value="address2")  //Byname but this ues in @Autowired presence
        Address address1;

		public Address getAddress1() {
			return address1;
		}

		public void setAddress1(Address address1) {
			this.address1 = address1;
		}
}
