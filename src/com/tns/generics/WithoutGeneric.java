package com.tns.generics;
import java.util.ArrayList;

public class WithoutGeneric {

	public static void main(String[] args) {
	/*	ArrayList list = new ArrayList();
		list.add("Ravi N");
		list.add(123);     // error
		for (Object object:list)
		{
			String str = (String)object;
			System.out.println(str);
		}*/
		
		ArrayList <String>list = new ArrayList<String>();
		list.add("Ravi N");
		list.add("pavi");     // error
		for (String str:list)
		{
			System.out.println(str);
		}
		
		
	

	}

}
