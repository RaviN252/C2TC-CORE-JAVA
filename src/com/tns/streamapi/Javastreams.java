package com.tns.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Javastreams {
	public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	 names.add("Anjali");
	 names.add("ravi");
	 names.add("pavi"); 
	 names.add("ashwin");
	 names.add("rock");
	 List<String> namesEndingWith_i = names.stream() // create a stream
	 
	 
	 		.filter(name -> name.charAt(name.length()-1)=='i') // intermediate step 
	 		.sorted()
	 		.collect(Collectors.toList());
	 		//namesEndingWith_i.forEach(System.out::println);
	 		// we can also wriye by using lambda expression
	 		 namesEndingWith_i.forEach(s->System.out.println(s));
	 }
}