package array_assignment;

public class Find_comman_no_from_2_array 
{
	public static void main(String[] args)
	{
		int a[]= {41,2,9,7,35,42,62};
		int b[]= {25,7,36,62,41,38,65};
		for(int i=0;i<a.length;i++)
		{                                   // TO find common element from 2 array...
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
