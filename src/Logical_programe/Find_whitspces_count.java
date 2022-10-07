package Logical_programe;

public class Find_whitspces_count 
{
	public static void main(String[] args)
	{
		String s="V E L O C I T Y";
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println("Spacese in String are :"+count);
	}

}
