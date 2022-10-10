package Array_assignment_2;

import java.util.Arrays;

public class Remove_dublicate_element 
{
	public static void main(String[] args)
	{
	   int a[]= {10,50,62,25,5,8,9,14,45,25,50,8};
	   Arrays.sort(a);
	  // int j=0;
	      for(int i=0;i<a.length-1;i++)
	      {
	    	  for(int j=i+1;j<a.length;j++)
	    	  {
	    	  if(a[i]!=a[j])
	    	  {
	    		  a[j]=a[i];
	    	  }
	    	  System.out.println(a[j]);
	    	  }
	    	 
	      }
	}
	
}
