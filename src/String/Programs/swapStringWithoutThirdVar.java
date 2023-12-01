package String.Programs;

public class swapStringWithoutThirdVar {

	
	public static void main(String args[])
	{
		String str1="Shubham";
		String str2="Mayur";
		
		
		System.out.println("String befor swap : str1 "+str1+ " && str2 "+str2);
		str1 =str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("String after swap : str1 "+str1+ " && str2 "+str2);
	}
}
