package String.Programs;

public class longestStringinArray {

	public static void main(String args[])
	{
	   String [] str= {"Ram","Shital","shiv is also good boy","Rajkumar","sham is also good boy"};
	   
	   String s=" ";
	   
	   int len=str[0].length(),l=0;
	   
	   for(int i=0;i<str.length;i++)
	   {
		   l=str[i].length();
		   if(l>len) {
			   len=l;
			   s=str[i];
		   }
	   }
	   System.out.println("Longest string in the array is : "+ s);
	}
}
