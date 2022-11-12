package com.tns.firstprog;
import java.util.Scanner;
public class ScannerDemo1 {
	public static void main(String[] args)
	{
	Scanner obj1 = new Scanner(System.in);
	System.out.println("Enter The Details");
	String name =obj1.next();
	char gender = obj1.next().charAt(0);
	int age = obj1.nextInt();
	long mobileNo = obj1.nextLong();
	System.out.println("Name:"+ name);
	System.out.println("Gender:" +gender);
	System.out.println("Age:"+ age);
	System.out.println("MobileNo:"+mobileNo);
	
	
	

		
	
	}
	

}
