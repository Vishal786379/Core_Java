package com.vishal.corejava;

public class InstanceVaiable {
	
	//declered inside class and outside the methods
	//used with object of class
	//object.variable
	
	int x = 50;//instance variable
	double y = 450.12;
	float z;
	
	public static void main(String args[]) {
		
		System.out.println("Program Started");
		//System.out.println(x); //static reference to non static field
		
		//object create
		InstanceVaiable obj = new InstanceVaiable();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		System.out.println("=================================");
		
		InstanceVaiable obj1 = new InstanceVaiable();
		System.out.println(obj1.x);
		
		System.out.println("=================================");
		
		obj.x=200;
		obj1.x=400;
		System.out.println(obj.x);
		System.out.println(obj1.x);
		
		System.out.println("=================================");
		System.out.println(obj.z);
		
		
	}

	boolean a = true;
}
