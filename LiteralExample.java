package com.vishal.corejava;

public class LiteralExample {
	
	//Literal is the source code representation of fixed value
	//literal are represented directly in your code without requiring computation.
	public static void main(String args[]) {
		System.out.println("Program Start");
		
		//boolean literal
		boolean result = false;
		
		char ch ='A';
		
		int i = 100;
		
		String str = "Vishal";
		
		System.out.println("Boolean Literal : "+result);
		System.out.println("Char Literal : "+ch);
		System.out.println("Integer Literal : "+i);
		System.out.println("String Literal : "+str);
		
		System.out.println("==============================");
		System.out.println("******Interger Literal******");
		
		byte n1 = 12;
		short n2 = 4444;
		int n3 = 35252;
		long n4 = 252525l;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		System.out.println("==============================");
		
		//Decimal
		int valueDec = 26;
		
		//Hexadecimal : prefix 0x [0 -9, A-F]
		int valueHex = 0x1a;
		
		//Binary : prefix 0b [0,1]
		int valueBin=0b11010;
		
		System.out.println(valueDec);
		System.out.println(valueHex);
		System.out.println(valueBin);
		
		System.out.println("******Floating Literal******");
		
		float f = 1313.24324F;
		double d =3235.235235D;
		double d1 = 3454.876;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);
		
		
		float f1=2.3f;
		double d3 = 1.23e2;
		System.out.println(d3);
		
		
		System.out.println("******Character Literal******");
		
		//'A','\u0000','\f0000'
		
		char ch1='V';
		char ch2 = '!';
		char ch3 = '\u0000';
		char ch4 =  '\u00F1';
		char ch5 ='\0';
				
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		
		System.out.println("Hii"+'\t'+"How are you");
		
		//\t tab space
		// \n new line
		// \f formfeed
		// \r carriage return
//		\"  double quote
//		\' single quote
		
		
		System.out.println("******Character Literal******");
		
		String name ="subString";
		String test = null;
		
		System.out.println(name);
		System.out.println(test);
		
		
		System.out.println("==========================");
		long debitCardNumber = 121212_232323_67786L;
		System.out.println(debitCardNumber);
		
		float pi= 3.14_15f;
		System.out.println(pi);
		
		long hexValue=0x11_323_10;
		System.out.println(hexValue);	
		
		int binValue = 0b11_11_10;
		System.out.println(binValue);
				
		
		
		
	}
}
