package com.tns.SenderThreadPriority;

public class ThreadPriorityDemo extends Thread {
	public void  run()
	{
		System.out.println("Thread" + Thread.currentThread().getName() + "running");
	}

	public static void main(String[] args) {
		ThreadPriorityDemo th1 = new ThreadPriorityDemo ();
		

	}

}
