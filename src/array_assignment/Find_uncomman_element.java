package array_assignment;

public class Find_uncomman_element 
{
	public static void main(String[] args)
	{
		int a[]= {42,65,42,84,3,6,8,1,2};
		int b[]= {54,35,6,2,1,84,64,5,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{                                             //uncomplete......
				if(a[i]==b[j])
				{
					System.out.println("");
				}
				else if(a[i]!=a[j])
				{
					System.out.println(a[j]);

				}
		
		}
		}
		
		
	}

}
