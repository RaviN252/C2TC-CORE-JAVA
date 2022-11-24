package com.tns.MultiThreading2ndway;

public class ImplementRunnable implements Runnable  {
	
	@Override
	public void run() {
		System.out.println("Welcome to second way of creating thread ");
	}
	
	public static void main(String[] args) {
		ImplementRunnable  ob1 = new ImplementRunnable ();
		Thread ob2 = new Thread(ob1);
		}
	}
