package com.tns.Collections;
import java.util.ArrayList;
import java.util.Vector;;
public class VectorDemo {

	public static void main(String[] args) {
		// create an empty vector object with an initial capacity of 5
		Vector v = new Vector();
		
		// check the size of vector before adding elements
		int size = v.size();
		System.out.println("size of vector before adding elememnts :"+ size);
		
		// adding elements to vector using refrence varaible v
		v.add("blue");
		v.add("black");
		v.add("white");
		v.add("navyblue");
		v.add("skyblue");
		System.out.println("vector elememnts :"+ v);
		
		// checking thye size and tye  capicity
		int vectorsize = v.size();
		System.out.println("size :"+ vectorsize);
		
		int capacity = v.capacity();
		System.out.println("Default capacity:"+ capacity);
		
		// adding an elements using addElemnts () method
		v.addElement(null);
		v.addElement(20);
		v.add(5,15);
		int newsize = v.size();
		System.out.println("new size after adding elemets: "+ newsize);
		
		int newcapacity = v.capacity();
		System.out.println("new capacity after adding elements"+ newcapacity);
		System.out.println("Elements order after addition"+ v);
		
		// Create new arraylist with new initial capity 10
		ArrayList al = new ArrayList();
		
		// Adding  elements  using refrence variable al.
		al.add("Browm");
		al.add("Green");
		
		
		// call addall
		v.addAll(al);
		// new check the size
		int vsize = al.size();
		System.out.println("size :"+ vsize);
		int Vcapacity = v.capacity();
		System.out.println("Vcapacity :" + Vcapacity);
		
		// adding 11th element to check size and capacity
		v.add(10);
		System.out.println("Elements:" + v);
		
		int vecsize = v.size();
		System.out.println("Size after adding 11 th element :" + vecsize);
		
		int cap = v.capacity();
		System.out.println(" capacity after adding 11th elements:"+ cap);
	}
}
