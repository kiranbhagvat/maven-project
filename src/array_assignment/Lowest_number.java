package array_assignment;

public class Lowest_number 
{
	public static void main(String[] args)
	{
		int a[]= {5,8,3,65,4,7,9,54};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum :"+min);
	}

}
