package Logical_programe;

public class Remove_spacial_charecter 
{
	public static void main(String[] args)
	{
		String s="Ki@#r&,an";
		
		String s1=s.replaceAll("Ki@#r&,an", "Kiran");
		
		System.out.println(s1);
	}
}
