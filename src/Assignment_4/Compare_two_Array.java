package Assignment_4;

import java.util.Arrays;

public class Compare_two_Array
{
	public static void main(String[] args)
	{
		int a1[]= {10,20,30};
		int a2[]= {40,50,60};
		int a3[]= {40,50,60};
		
		System.out.println(Arrays.equals(a1, a2));              //false
		System.out.println(Arrays.equals(a2, a3));         //True
		}

}
