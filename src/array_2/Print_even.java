package array_2;

public class Print_even 
{
	public static void main(String[] args)
	{
		int a[]= {42,52,14,63,45,2,4,9,3,4,6};
		for(int i=0;i<a.length;i++)
		{                                   //To print even numbers
			if(a[i]%2==0)
			{
				System.out.println("To print even numbers :"+a[i]);
			}
		}
		System.out.println(" \n To print odds number");
		for(int j=0;j<a.length;j++)
		{                                   //To print odds numbers
			if(a[j]%2!=0)
			{
				System.out.print(" :"+a[j]);
			}
		}
	}

}
