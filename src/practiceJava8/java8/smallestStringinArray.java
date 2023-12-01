package practiceJava8.java8;

import java.util.Arrays;
import java.util.Optional;

public class smallestStringinArray {

	public static void main(String args[])
	{
		String [] str= {"Shubham","Suresh Raj","Shivam","Rajesh"};
		 String smallestStringinArray = Arrays.stream(str).reduce((s1,s2) -> s1.length() < s2.length() ? s1:s2).get();
		 System.out.println("Smallest string given array is : "+smallestStringinArray);
	}
}
