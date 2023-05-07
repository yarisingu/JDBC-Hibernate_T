package subject;

public class Nonstaticandstatic {
	
	public static void s1()
	{
		System.out.println("static with public access spcifier");
	}
	static void s2()
	{
		System.out.println("static with default access spcifier");
	}
	protected static void s3()
	{
		System.out.println("static with protected access spcifier");
	}
	private static void s4()
	{
		int a=10;
		System.out.println(a+"  static with protected access spcifier");
	}
	public static void main(String[] args) {
		
	}
	
}
