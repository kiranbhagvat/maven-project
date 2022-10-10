package non_primitives;

public class Upcasting 
{
	public static void main(String[] args)
	{
	    Father_class s=new Son();
	    s.Car(10.3f);          //create object of Son with the refrence of Father
	    s.Money(20);
	    s.Car(53.2f);
	    
	    System.out.println(" \n ");
		
		//downcasting
		//Father_class d=new Father_class();
		//d.Car();
		//d.Land();
		//d.Mobile();
		//d.Money();
		
		
		
		
	}

}
