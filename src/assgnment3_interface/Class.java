package assgnment3_interface;

public class Class implements I1,I_2
{
	public void m1()
	{
		System.out.println("M1 is class");
	}
	public  void m2()
	{
		System.out.println("M2 is static method of class");
	}
	public void m3()
	{
		System.out.println("M3 is Interface I_2 method");
	}
	public void m4()
	{
		System.out.println("M4 is interface method");
	}
	
		public static void main(String[] args)
	{
		Class c=new Class();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
	}

}
