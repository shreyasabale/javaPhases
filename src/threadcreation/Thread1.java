package threadcreation;

public class Thread1 extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Thread1 mt = new  Thread1();
  		mt.start();
 	}
}
