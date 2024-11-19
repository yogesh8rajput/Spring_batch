package com.mycompany;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean,DisposableBean
{

	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("setting of x");
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Init method");
		
	}

	public void destroy() throws Exception {

		System.out.println("Destroyyyy");
		
	}
	
	
	
	
}
