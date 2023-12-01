package practiceJava8.java8;

import java.util.Arrays;

public class Java8 {

	public static void main(String args[])
	{
		int [] ary= {1,5,7,3,4,5,6,7,13};
		
		int sum = Arrays.stream(ary).sum();
		System.out.println("Sum of given array : "+sum);
	}
}
