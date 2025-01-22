package com.vishal.corejava;

public class TypeCastingExample {
	
	//converting one type value to another type
	//ex pen category change into pencil category
	//assign a vlue of one data type to another type
	
	//implicit type casting : automatic , mostly smaller to large, compiler will do this, no loss of data
	
	//explicit typecasting : manual, data loss, we have to do this, large to small type
	
	//double d = 45.56
	//float f =(float)d;
	
	//double-> float->long->int->short->byte

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 45.56;
		float f =(float)d;
		
		System.out.println(d);
		System.out.println(f);
		
		//float 4 bytes
		//long 8 bytes
		float f2 = 12.23f;
		long l= (long) f2;
		
		System.out.println(f2);
		System.out.println(l);
		
		
	}

}
