package String.Programs;

public class PalindromString {

	
	public static boolean isPalindrom(String s)
	{
		boolean ans=false;
		String rev="";
		
		for(int i=s.length()-1;i >=0 ;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			ans=true;
		}
		return ans;
	}
	
	public static void main(String args[]) 
	{
		String str="abba";
		if(isPalindrom(str.toLowerCase()))
		{
			System.out.println("Given string is palindrom");
		}else
		{
			System.out.println("Given string is not palindrom");
		}
		
	}
}
