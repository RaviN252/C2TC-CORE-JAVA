package com.tns.opps.package2;

public class TicketBooking {
static int ticket = 0;
	
	 //TicketBooking() //constructor
	 {
		 ticket++;// it will increment the static varible by 1 for each object creation.
	 }
	 void display()// instance
	 {
		 System.out.println("total no of tickets boocked"+ticket);
		 
	 }

	public static void main(String[] args) { 
		TicketBooking t=new TicketBooking();
		t.display();
		TicketBooking t1=new TicketBooking();
		t1.display();
		TicketBooking t2=new TicketBooking();
		t2.display();
		TicketBooking t3=new TicketBooking();
		t3.display();
	}

}
