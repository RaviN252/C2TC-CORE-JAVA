package Synchronization;

public class Thread2  extends Thread{
	Table t; // Declaration of variable t of class type Table
		
		//Declare one parameter constructor and pass variable t as a parameter.
		
		Thread2(Table t)
		{
			this.t = t;
		}
	public void run() 
	{
		t.PrintTable(10);
	}

}
