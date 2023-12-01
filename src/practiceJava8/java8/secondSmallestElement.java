package practiceJava8.java8;

import java.util.Arrays;

public class secondSmallestElement {

	public static void fetchSecondSmallestElement(int[] arr)
	{
		 int secSmallestElement = Arrays.stream(arr)
				 						.distinct()
				 						.sorted()
				 						.skip(1)
				 						.findFirst()
				 						.orElseThrow(() -> new IllegalArgumentException("There is no second smallest elememt"));
	     System.out.println("Second smallest element is : "+secSmallestElement);
	}
	public static void main(String args[])
	{
		
		int [] num= {5,8,1,4,9,2,1};
		fetchSecondSmallestElement(num);
	}
}
