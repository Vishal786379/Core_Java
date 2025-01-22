package com.vishal.corejava;

public class NonPrimitiveDataTypesExample {
	
	//Reference data type
	//user define data type
	//user define as per need
	// ex student : name , age, class, phone,college

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		Student student1= new Student();
		student1.name="Vishal";
		student1.address="Mumbai";
		student1.college="GPM";
		student1.phone=1234567898;
		
		
		System.out.println("Student 1 Details");
		System.out.println(student1.name);
		System.out.println(student1.address);
		System.out.println(student1.college);
		System.out.println(student1.phone);
		
		Student student2= new Student();
		
		student2.name="Supriya";
		student2.address="Mumbai";
		student2.college="Tolani";
		student2.phone=9898666758l;
		
		System.out.println("Student 2 Details");
		
		System.out.println(student2.name);
		System.out.println(student2.address);
		System.out.println(student2.college);
		System.out.println(student2.phone);
	}

}
