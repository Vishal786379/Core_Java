package com.vishal.corejava;

public class LocalVariable {
	
	public static void m1() {
		int temp = 20;
	}
	
	public static void main(String args[]) {
		//local variable
		//inside method, block, if while do while
		int a = 50;
		System.out.println(a);	
		if(true) {
			int y = 55;
			System.out.println(y);
		}
		
//		System.out.println(y);	exception occures
		int z ;
		//initialized must have to initialized
		z=40;
		System.out.println(z);
	}

}
