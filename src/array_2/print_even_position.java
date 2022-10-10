package array_2;

public class print_even_position 
{
	public static void main(String[] args)
	{
		int ar[]= {14,6,42,32,12,41,24};
		for(int i=1;i<ar.length;i=i+2)       //To print even position of index
		{
		    System.out.println(ar[i]);	
		}
		System.out.println("\n odd position");	
		for(int j=0;j<ar.length;j=j+2)
		{
			System.out.println(ar[j]);	  //To print odd position of index...
		}
	}

}
