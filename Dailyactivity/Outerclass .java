public class Outerclass {

	
		int a=101;
		class Innerclass
		{
			void disp()
			{
				System.out.println("the value of a is:"+a);
			}
		}
		public static void main(String[] args)
		{
			Outerclass o=new Outerclass();
			Outerclass.Innerclass i=o.new Innerclass();
			i.disp();
		
		

	}

}
