package non_primitives_Non_static;

public class Child extends Father
{
	
	public  void m2()
	{
		System.out.println("M1 is executing of Child method");
	}
	public void money()
	{
		
	System.out.println("Child has money :800 Rs");
	}
	
	public void Car()
	{
		
	System.out.println("Father has car :2000 Rs");
	}
	public static void main(String[] args)
	{
		Father f=new Child();
		f.m1();
		f.money();
		f.land();
		}

}


