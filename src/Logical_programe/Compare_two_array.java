package Logical_programe;

import java.util.Arrays;

public class Compare_two_array 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		int b[]= {10,20,30,43};
		String c[]= {"Kiran","Mohit","Vaibhav","Girish"};
		String d[]= {"Kiran","Mohit","Vaibhav","Girish"};
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println(Arrays.equals(c, d));
	}

}
