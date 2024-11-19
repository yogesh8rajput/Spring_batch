package com.mycompany;

public class Test {
	int x,y;

	public Test(int x, int y) {
		
		this.x = x;
		this.y = y;
		System.out.println("Continue.... int"+x+y);
	}

	
public Test(double x, double y) {
		
		this.x = (int)x;
		this.y = (int)y;
		System.out.println("Continue.... double"+x+":"+y);
	}



public Test(String x, String y) {
	
	this.x = Integer.parseInt(x);
	this.y = Integer.parseInt(y);
	System.out.println("Continue.... String"+x+y);
}

	public void add()
	{
		
		int z=x+y;
		System.out.println("Addition:"+z);
	}
	
}
