// PROGRAM TO CHECK JOIN METHOD
package exceutor;

public class Joinmethod extends Thread // CREATE THREAD BY EXTENDS METHOD THREAD1
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception a)
			{
				System.out.println(a);
			}
			System.out.println(i);
		}
	}
	

	public static void main(String[] args)throws SecurityException
	{
		Joinmethod j=new Joinmethod();
		Joinmethod j1=new Joinmethod();
		j.start();
		j1.start();
		
	}

}
