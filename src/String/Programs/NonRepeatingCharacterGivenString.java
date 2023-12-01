package String.Programs;

import java.util.HashSet;
import java.util.Scanner;

public class NonRepeatingCharacterGivenString {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String sen=sc.nextLine();
		
		HashSet<Character> unique=new HashSet<Character>();
		
		for(int i=0; i<sen.length();i++)
		{
			char ch=sen.charAt(i);
			if(unique.contains(ch)==true)
				unique.remove(ch);
			else
				unique.add(ch);
		}
		if(unique.size()==0)
			System.out.println("There is no unique character");
		
		for(Character ch:unique)
		{
			System.out.println(" "+ch);
		}
	}
	
	

}
