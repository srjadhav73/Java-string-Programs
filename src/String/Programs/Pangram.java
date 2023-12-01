package String.Programs;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	 public static boolean isPangram(String str)
	 {
		 Set<Character> alphabet =new HashSet<>();
		 
		 for(char ch : str.toCharArray())
		 {
			if(ch>= 'a' && ch<='z')
			{
				alphabet.add(ch);
			}
			if(ch >='A' && ch<='Z')
			{
				ch=Character.toLowerCase(ch);
				alphabet.add(ch);
			}
		 } 		 
		 return alphabet.size()==26;
	 }
	 
	 public static void main(String args []) 
	 {
		String str="abcdefghijklmnopqrstuvwxyz";
		if(isPangram(str))
		{
			System.out.println(str +" String is panagram");
		}
		else
		{
			System.out.println(str +" String is not panagram");
		}
	 }
}
