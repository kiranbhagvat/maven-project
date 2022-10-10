package Array_assignment_2;

public class Merge_two_array 
{
	public static void main(String[] args)
	{
		 int a[]= {4,5,8,3};
		 int b[]= {8,9,12,13,14};
		 int a_leng=a.length;
		 int b_leng=b.length;
		 int c_leng=a.length+b.length;
          int c[]=new int[c_leng];
	
		 for(int i=0;i<a_leng;i++)
		 {
			 c[i]=a[i];
			 for(int j=0;j<b_leng;j++)
			 {
				 c[a_leng+j]=b[j];	 
			 }
			 for(int k=0;k<c_leng;k++)
			 {
				 System.out.println(c[k]+" ");
			 }
		 }
	}

}
