package exceutor;

public class Suspendtest extends Thread
{
	public void run()

	{
		System.out.println(Thread .currentThread().getName());
		
	}
	

	public static void main(String[] args)
	{
		Suspendtest s=new Suspendtest();
		Suspendtest s1=new Suspendtest();
		s.start();
		s1.start();
		s.suspend();
		s.resume();
		s.stop();
		s.resume();
		
		

	}

}
