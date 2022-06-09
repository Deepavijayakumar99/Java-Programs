// program to test communication between main thread as well as user defined thread
package executor;
class Testthread implements Runnable
{
	int total;
	

	public void run() 
	{
		for(int i=1;i<100;i++)
		{
			total=total+i;
			if(total>100)
			{
				synchronized(this)
				{
					notify();
				}
			}
			try
			{
				Thread.sleep(50);
			
			}
			catch(InterruptedException a)
			{
				
			}
			System.out.println("Total thread  by user:"+total);
		}
		
	}

	
		
		
	}



public class Testintercommunication {

	public static void main(String[] args) {
		Testthread  test=new Testthread();
		Thread t=new Thread(test);
		t.start();//thread start to exceute
		try
		{
			synchronized(test)
			{
				test.wait();
			}
		}
				
			
			catch(InterruptedException a)
			{
							}
		System.out.println("main method creates total:"+test.total);

		
	}

	}


