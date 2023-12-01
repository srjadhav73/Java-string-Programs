package practiceJava8.java8;

import java.util.Arrays;

public class longestStringinArray {

	public static void main(String args[])
	{
		String [] str= {"Shubham","Suresh Raj","Shivam","Raj"};
		String longestStringinArray = Arrays.stream(str).reduce((s1, s2) -> s1.length() > s2.length() ?s1:s2).get();
		System.out.println("Using Java8  Longest String given array is : " +longestStringinArray);
		
		int  l=str[0].length(),len=0;
		String s=" ";
		for(int i=0;i<str.length;i++)
		{
			len=str[i].length();
			if(len>l)
			{
				l=len;
				s=str[i];
			}
		}
		System.out.println("Longest String given array is : "+s);
		
	}
}
