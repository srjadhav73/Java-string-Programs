package String.Programs;

import java.util.Scanner;

public class LongestWordInString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String--->");
		String sen=sc.nextLine();
		
		sen=sen+" ";
		String word="",lg="";
		
		for(int i=0;i<sen.length();i++)
		{
			char ch=sen.charAt(i);
			if(ch!=' ')
			{
				word=word+ch;
			}else
			{
				if(word.length()>lg.length())
					lg=word;
				word="";	
			}
		}
		System.out.println("Longest word in string is --->"+lg);
	}
}
