public class Referencevar {
	final static int a=20;

	public static void main(String[] args) {
		final StringBuilder b=new StringBuilder(34);
		System.out.println(b);
		b.append(a);
		System.out.println(b);
		

	}

}
