package array_2;

public class Find_largest_no_in_Array
{
	public static void main(String[] args)
	{
		int a[]= {12,42,54,3,1,42,84,35};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
				if(a[i]>max)
				{                           //To find largest number from array...
					max=a[i];
				}
		}
			System.out.println("Largest number is :"+max);
			
			
	
	}

}
