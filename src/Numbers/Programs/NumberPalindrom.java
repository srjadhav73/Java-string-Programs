package Numbers.Programs;

public class NumberPalindrom {

	public static Boolean isPalindrom(String str)
	{
		Boolean ans=false;
		
		String rev="";
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			ans=true;
		}
		return ans;
	}
	
	public static void main(String args[])
	{
		String s="12321";
		if(isPalindrom(s))
		{
			System.out.println("Given number is palindrom");
		}else
		{
			System.out.println("Given number is not palindrom");
		}
	}
}
