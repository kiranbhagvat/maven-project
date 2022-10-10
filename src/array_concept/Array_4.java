package array_concept;

public class Array_4
{
	public static void main(String[] args)
	{
	int a,b;
	int c[],d,f,h;     //Both are Array
	int m[],n;         //m is Array and  n  is int type variable.....
	
	int ar[]= {52,65,455,754,24};
	int array[]= {24,56,45,75,21};
	System.out.println(" Array :" +ar.length);
	
	for(int i=0;i<ar.length;i++)                 //print array
	{
		System.out.println(" Array :" +ar[i]);
	}
	System.out.println("\n Second array in Reverse order"
			+ "");
	for(int j=4;j>=0;j--)                          //printing array in reverse order..
	{
		System.out.print("  :" +array[j]);
	}
	}
}
