package array_2;


public class Array_3_find_dublicate 
{
	public static void main(String[] args)
	{
		int a[]= {10,5,6,8,10,14,8,4,3,21,23,14,4,36};
	    for(int i=0;i<a.length;i++)
	    {
	      for(int j=i+1;j<a.length;j++)
	      {
	    	  if(a[i]==a[j])
	    	  {
	    		  System.out.println("Dublicate elements are :"+a[j]);
	    	  }
	      }
	      }
	 }
	         

}
	