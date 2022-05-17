class Testnestedexception {

	public static void main(String[] args) {
		try
		{
			try
			{
				int a=1/0;
			}
			catch(ArithmeticException e1)
			{
				System.out.println("First block gets excute...");
			}
			try
			{
				String b=null;
				System.out.print(b.length());
			}
			catch(NullPointerException e2) {
				System.out.println("Null pointer Exception handled:");
			}
		}
			finally
			{
				System.out.println("Arithmetic Exception handle:");
			}
			
			
			
		}

	}
