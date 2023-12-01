package String.Programs;

public class PermutationString {

	
	static void printPermutationString(String str, String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans + " ");
			return ;
		}
		
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			String restStr=	str.substring(0 , i);
							str.substring(i + 1);
		    printPermutationString(restStr,ans + ch);
							
		}
	}
	public static void main(String args[])
	{
		String s="abb";
		printPermutationString(s, "");
	}
}
