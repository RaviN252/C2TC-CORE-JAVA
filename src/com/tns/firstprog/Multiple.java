package com.tns.firstprog;
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = Sc.nextInt();
		if (num%3==0)
		{
			System.out.println("Number is Multiple by 3");
		}
		else
		{
			System.out.println("Number is  Not Multiple by 3");
		}
		

	}

}
