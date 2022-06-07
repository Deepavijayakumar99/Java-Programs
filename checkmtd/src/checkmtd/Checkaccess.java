package checkmtd;

public class Checkaccess extends Thread {
	public void run()
	{
		System.out.println("After exceution :"+Thread.currentThread().getName());
		
	}
	

	public static void main(String[] args) {
		 Checkaccess c=new  Checkaccess();
		 Checkaccess c1=new  Checkaccess();
		 c.start();
		 c1.start();
		 c.checkAccess();
		 System.out.println("check whether thread has access:"+c.getName());
		 c1.checkAccess();
		 System.out.println("check whether thread has access:"+c1.getName());
	
	}

}
