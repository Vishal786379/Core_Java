package com.vishal.corejava;

public class First {

	public static void main(String args[]) {
		
		System.out.println("Hello World");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
		
	class second{
		public static void main(String args[]) {
			
			System.out.println("Second, Hello World");
			
		}
	}
	
	class third{
		public static void main(String args[]) {
			
			System.out.println("Third, Hello World");
			
		}
	}
	class fourth{
		final synchronized public static void main(String args[]) {
			
			System.out.println("Fourth, Hello World");
			
		}
	}

}

