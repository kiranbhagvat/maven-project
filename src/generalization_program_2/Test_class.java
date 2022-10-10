package generalization_program_2;

public class Test_class {

	public static void main(String[] args)
	{
		System.out.println("Car Features Are :");
		Car c=new Car();
		c.feulAmount();
		c.capacity();
		c.Applybreaks();
		c.Drive_to_office();
		c.park_at_Home();
		System.out.println("\n Car Features Are :");
		Bus b=new Bus();
		b.feulAmount();
		b.Charge_fair();
		b.Applybreaks();
		b.Charge_fair();
		b.capacity();
		System.out.println("\n Car Features Are :");
		Truck t=new Truck();
		t.feulAmount();
		t.capacity();
		t.capacity();
		t.To_trasport_goods();
		t.Unload_goods();
		t.Applybreaks();
	

	}

}
