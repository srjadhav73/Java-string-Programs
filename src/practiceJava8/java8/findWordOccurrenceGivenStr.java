package practiceJava8.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findWordOccurrenceGivenStr {
	public static void main(String args[])
	{
		String str="Hello shubham Hello Java8";
		List<String> list = Arrays.asList(str.split(" "));
		
		Map<String, Long> findWordOccurrenceGivenStr = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Word occourance in given string is : "+findWordOccurrenceGivenStr);
	}

}
