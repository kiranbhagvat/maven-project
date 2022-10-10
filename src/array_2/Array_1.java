package array_2;

public class Array_1
{
	private static int j;

	public static void main(String[] args)
	{
		int ar[]= {41,52,12,45,3,8,6,4};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)          //To print array in ascending order..
			{
			
			int temp;
			if(ar[i]>ar[j])
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			}
			System.out.print( ar[i]+ " " );
		}
	}

}
