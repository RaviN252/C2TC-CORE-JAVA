package com.tns.TryCatch;
import java.io.IOException;
public class Throwstest1{
	
	static void display() throws IOException
	{
		System.out.println("Hello java");
		throw new IOException();
	}
	public static void main(String[] args) {
		Throwstest1 obj = new Throwstest1();
		try 
		{
			obj.display();
		}
		catch(IOException e)
		{
			System.out.println("Caught an Exception:\n"+e);
		}
		
	}
	}