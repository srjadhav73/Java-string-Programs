package practiceJava8.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseArrayIntInPlace {

	public static void fetchreverseArrayIntInPlace(int [] array)
	{
	
		IntStream.range(0,array.length/2).forEach(i -> {
			
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		});
		System.out.println("Reversed Array is  : "+Arrays.toString(array));
	}
	public static void main(String args[])
	{
		
		int [] array1= {1,2,3,4,5};
		fetchreverseArrayIntInPlace(array1);
	}
}
