package assignment_1;

public class fibbonaci_serise
{
	public static void main(String[] args)
	{
		int n1=0,n2=1;
		int i;int n3;
		//int count=10;
		System.out.println(n1+""+n2);
		for(i=2;i<=10;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
