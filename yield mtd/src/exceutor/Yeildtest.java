package exceutor;

public class Yeildtest extends Thread {
	public void run()
	{
		for(int i=1;i<=2;i++)
			System.out.println("thraed in pause mode:"+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Yeildtest y=new Yeildtest();
		Yeildtest y1=new Yeildtest();
		y.start();
		y1.start();
		for(int i=1;i<=2;i++)
			{
			y1.yield();
			System.out.println("thread in exceution mode:"+Thread.currentThread().getName());
			}
			}

}
