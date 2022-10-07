package assignment_1;

import java.util.Scanner;

public class Prime_no
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no=s.nextInt();
		int t=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				t=t+1;
			}
		}
		if(t==0)
		{
			System.out.println(no+" no is prime number");
		}
		else
		{
			System.out.println(no+" is not prime Number ");
		}
	}  
}
