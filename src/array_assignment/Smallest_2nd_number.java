package array_assignment;

public class Smallest_2nd_number
{
	public static void main(String[] args)
	{
		int a[]= {4,6,8,25,3,12,14,36,24,32};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
				    temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		System.out.println(" 2nd Smallest no :"+a[1]);
	}

}
