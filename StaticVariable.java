package com.vishal.corejava;

public class StaticVariable {
	
	//single copy for all object
	//teacher example class room
	//static variable can;t become local variable
	static int n1 = 100;
	
	public static void main(String args[]) {
		System.out.println("Program Stated");
		System.out.println(StaticVariable.n1);
//		StaticVariable obj = new StaticVariable();
		
		
		
	}
}
