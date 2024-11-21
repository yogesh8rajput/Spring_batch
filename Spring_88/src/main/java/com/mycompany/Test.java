package com.mycompany;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Test {
    
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("Setting in x");
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Init ");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Destroy");
	}
}
