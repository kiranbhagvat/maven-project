package array_assignment;

public class largest_2_no 
{
	public static void main(String[] args)
	{
		int a[]= {42,5,8,3,46,32,15,21,35};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
				System.out.println("2nd largest no :"+a[1]);
			
		
	}

}
