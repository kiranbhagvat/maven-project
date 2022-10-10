package array_2;

public class Sum_of_two_array 
{
	public static void main(String[] args)
	{
		int a[]= {41,2,5,8,7,6,2,43,4,2,4};
		int b[]= {4,2,6,8,7,96,1,2,54,4};
		int sum1=0;
		int sum2=0;
		int sum;
		for(int i=0;i<a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		for(int j=0;j<b.length-1;j++)
		{
			sum2=sum2+b[j];
		}
		sum=sum1+sum2;
		System.out.println("Sum of two Array:"+sum);
		
	}

}
