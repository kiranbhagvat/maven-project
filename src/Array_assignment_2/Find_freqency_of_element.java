package Array_assignment_2;

import java.util.Arrays;

public class Find_freqency_of_element 
{
	public static void main(String[] args)
	{
		int a[]={1,5,4,3,6,8,8,7,2,1,4,3,3,5};
		int count=0;
		Arrays.sort(a);
	
		for(int i=0;i<a.length;i++)
		{
			int d=1;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				d++;
				a[j]=-1;
			}
			count=d;
			
		}
			if(a[i]!=-1)
		System.out.println(a[i]+" Freqency "+d);
		}
	}

}
