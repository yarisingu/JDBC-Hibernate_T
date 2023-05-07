package subject;

abstract class abrat
{
	 public abstract void m1();
	abstract public void m2();
	public void m3()
	{
		System.out.println("m3");
	}
}

class overriding extends abrat
{
	public void m1()
	{
		System.out.println("m1 over ridden");
	}
	public void m2() {
		System.out.println("m2 over ridden");
	}
	public void m3()
	{
		System.out.println("m3 over ridden");
	}
}

public class Abstract {

	public static void main(String[] args) {
		 abrat a = new overriding();
		a.m1();
		a.m2();
		a.m3();

	}

}
