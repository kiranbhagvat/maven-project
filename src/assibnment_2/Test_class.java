package assibnment_2;

public class Test_class 
{
	public static void main(String[] args)
	{
		Parent_class p=new Parent_class();
		p.m1();
		p.m2();
	
		
		System.out.println("\n Child class object created");
		Child_class c=new Child_class();
		c.m1();
		c.m2();
		
		
		//Upcasting creating object of Child class with refernce of parent
		
		
		System.out.println("\n Creating upcasting object");
		Parent_class p1=new Child_class();
		p1.m1();          
		p1.m2();	
	}
	

}
