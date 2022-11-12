package SenderAndreceiverUsingThreads;

public class SynchronizationBlockDemo {

	public static void main(String[] args) {
		Sender Sender = new Sender();
		SendUsingThreads   sender1 = new  SendUsingThreads("hello",Sender);
		SendUsingThreads   sender2 = new  SendUsingThreads("Welcome to TNS India",Sender);
		
		// starting two thread of sendusingThread type
		sender1.start();
		sender2.start();
		
		//wait for threads to end 
		try
		{
			sender1.join();
			sender2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}

}
