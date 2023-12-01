package practiceJava8.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonEleOfTwoArrays {

	public static void fetchcommonEleOfTwoArrays(int[] ary1,int[] ary2)
	{
		List<Integer> commonEleOfTwoArrays= Arrays.stream(ary1).filter(number -> Arrays.stream(ary2).anyMatch(ary2Number -> ary2Number==number)).boxed().collect(Collectors.toList());
	    System.out.println("Common element given two arrays id : "+commonEleOfTwoArrays);
	}
	public static void main(String args[])
	{
		
		int [] array1= {5,8,1,4,9,2};
		int [] array2= {5,6,3,7,9,2};
		fetchcommonEleOfTwoArrays(array1,array2);
	}
}
