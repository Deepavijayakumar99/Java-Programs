// to create a thread class wheather is alive or not
package exceutor;

public class Alivetest extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(700);
			System.out.println("check wheather the thread is alive or not"+Thread.currentThread().isAlive());
			
		}
		
		catch(InterruptedException b)
		{
			
			
		}
	}


	public static void main(String[] args) {
		Alivetest a=new Alivetest ();
		System.out.println("Thread status:"+a.isAlive());
		a.start();
	

	}

}
