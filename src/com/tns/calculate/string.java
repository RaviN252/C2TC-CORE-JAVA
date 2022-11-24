package com.tns.calculate;

public class string {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "sachin";
		String s3= new String ("Sachin");
		String s4 = "Saurva";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		//System.out.println(s1==s2);
		//System.out.println(s1==s3);
		//System.out.println(s1==s4);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s1));

	}

}
