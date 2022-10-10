package array_concept;

public class Sample_1 
{
	public static void main(String[] args)
	{
		int ar[]=new int[6];    //Size of array is 6
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		ar[5]=6;
		
		System.out.println(ar[4]);
		System.out.println("length of Array :" +ar.length);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
