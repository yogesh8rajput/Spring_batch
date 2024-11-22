package com.mycompany;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Docter {
	  @Value("108")
      int d_id;
      String d_name;
      
      String d_profession;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	@Value("Deepu")
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_profession() {
		return d_profession;
	}
	@Value("Surgen")
	public void setD_profession(String d_profession) {
		this.d_profession = d_profession;
	}
      
}
