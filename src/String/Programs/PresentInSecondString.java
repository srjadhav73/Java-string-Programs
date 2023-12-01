package String.Programs;

public class PresentInSecondString {

	 static String removeDuplicateChar(String s1,String s2)
		{
		 	for(int i=0; i<s2.length();i++)
		 	{
		 		char ch=s2.charAt(i);
		 		while(s1.contains(ch+""))
		 		{
		 			  int itr = s1.indexOf(ch);
		               s1 = s1.replace((ch + ""), "");
		 		}
		 	}
		 	return s1;
		}		
		public static void main(String args[])
		{
			String s1="Shubham";
			String s2="Mayur";
			System.out.println(removeDuplicateChar(s1,s2));
		}
}
