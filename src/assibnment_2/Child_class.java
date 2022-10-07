package assibnment_2;

public class Child_class extends Parent_class
{
	public void m1()
	{
		System.out.println("M1 is Running of Child class");
	
	}
	public static void m2()
	{
		System.out.println("M2 is Running of Child class");

	}
	
	public static void main(String[] args) {
		
		String s="Kiran";
		String s1="";
		
		int i=4;
		
	     while(i>=0)
	     {
	    	 i--;
	    	 s1=s1+s.charAt(i);
	     }
	     System.out.println(s1);
	
	}

	
	
}
