package type_casting1;

public class Type_casting_primitives 
{
	 public static void main(String[] args)
	  {
		  //lower to higher data type 4 to 8 byte
		  int a=10;
		  System.out.println(a);                   //implicit 
		  double b=a;	 
		  System.out.println(b);
		  byte c=85;
		  System.out.println(c);
		  float n= c;
		  System.out.println(n);
		  System.out.println("explicit");
		  //higher to lower

		  float d=45.2f;
		  System.out.println(d);
		  byte s=(byte)d;                           //explicit
		  System.out.println(s);
		  
		    double e=424;
		  System.out.println(e);
		    byte w=(byte)e;
		  System.out.println(w);
		  
		  
		  float a1=42.6f;
		  System.out.println(a1);
		  byte d1=(byte)a1;
		  System.out.println(d1);


		  
		  
	  }


}
