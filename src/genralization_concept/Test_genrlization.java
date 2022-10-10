package genralization_concept;

public class Test_genrlization 
{
	public static void main(String[] args)
	{
		System.out.println("Jio Feature Are  :");
		Jio_Sim j=new Jio_Sim();
		j.audiocalling();
		j.videocalling();
		j.internet();
		j.jiofeture();
		j.messeging();
		
		System.out.println("Jio Feature Are as :");
		Airtal a=new Airtal();
		a.audiocalling();
		a.videocalling();
		a.internet();
		a.messeging();
		a.Newfeture();
		
		System.out.println("Jio Feature Are :");
		Vodaphon v=new Vodaphon();
		v.audiocalling();
		v.videocalling();
		v.internet();
		v.Newfeature();
		v.messeging();
		
	}

}
