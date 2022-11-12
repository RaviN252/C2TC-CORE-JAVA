package Synchronization;

public class Thread1 extends Thread{
	Table t; // Declaration of variable t of class type Table
		
		//Declare one parameter constructor and pass variable t as a parameter.
		
		Thread1(Table t)
		{
			this.t = t;
		}
	public void run() 
	{
		t.PrintTable(2);
	}

}
