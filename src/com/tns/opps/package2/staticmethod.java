package com.tns.opps.package2;

public class staticmethod {
	
	//instance area
	static int x = 20; // static variable 
	int y = 30;			//instance variable
	
	// declaring an instance variable
	void display()
	{
// instance variable so we directly call the instance variable without using object reference variable.
		System.out.println(x);// since we can access static member within instance area. Therefore we can call the static
		System.out.println(y);
	}
// Declare a static method.
	static void show() 
	{
// static area so we can call S.V. directly inside the S.M 
		int z = --x;
		System.out.println(z);
		// system.out.println(y); compile time error because instance variable cannot access inside s.m
	}
	public static void main(String[] args) {
		// create the object of the class.
		staticmethod st = new staticmethod();
// call instance method using reference variable st.
		st.display();
		
// call static method
		staticmethod.show();
		

	}

}
