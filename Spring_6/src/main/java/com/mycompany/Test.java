package com.mycompany;

public class Test {

	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		System.out.println("setting of x");
	}
	
	
	public void in()
	{
	System.out.println("init method");	
	}
	
	public void des()
	{
	System.out.println("destroy method");	
	}
	
}
