package com.tns.firstprog;

public class ClassObject {

	
		String make;
		int Model;
		double Cost;
		int yearofpur;
		public void display1()
		{

			System.out.println("year of purchase"+2001);
			System.out.println("make"+"Suzuki");
			
		}
		public void display2()
		{

			System.out.println("Model "+2000);
			System.out.println("cost "+70000);
			
		}
		public static void main(String[] args) {
			
			ClassObject ob1=new ClassObject();
			ClassObject ob2=new ClassObject();
			ob1.display1();
			ob2.display2();
			
	}

}
