package practiceJava8.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findStringInArrayStartWith {
	
	public static void main(String args[])
	{
		String [] str= {"Ram","Suresh Raj","shivam","Raj"};
		
	     List<String> newArray = Arrays.stream(str)
	    		 					   .map(s -> s.toUpperCase())
	    		 					   			 .filter(s1 -> s1.startsWith("S"))
	    		 					   .collect(Collectors.toList());
		System.out.println("Start with S in given array is : "+newArray);
	}

}
