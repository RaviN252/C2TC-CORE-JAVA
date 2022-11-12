// synchronized thread is used to run the thread in a orderer way one after the orther
// where as normal thread does not run in order it runs randomely
package Synchronization;

public class Table {
	synchronized void PrintTable(int n) // here the method is synchronized
	{
		for (int i = 1; i<=5;i++) 
		{
			System.out.println(n *i);
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException ie) 
			{
				System.out.println(ie);
			}
		}
	}
	

	public static void main(String[] args) {
		
		// Create an object of class table
		Table  obj = new Table();
		Thread1  t1 =  new Thread1(obj);
		Thread2  t2 =  new Thread2(obj);
		t1.start();
		t2.start();
		 

	}

}
