import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String[] args)
    {
       //Q1.Find a first not repeat character given string

         String str="Shubham";
         String firstNonRepeatEle = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()==1)
                .findFirst().get().getKey();

        System.out.println("1 st Non repeat elememt :-"+firstNonRepeatEle);

        //Q2.Find a first  repeat character given string


        String firstRepeatEle = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .findFirst().get().getKey();

        System.out.println("1 st repeat elememt :-"+firstRepeatEle);


        //Q2.Find a Second higest number from given array int[] num={5,9,11,2,8,21,1}
        int[] num={5,9,11,2,8,21,1};
        //First sorting the given Array

        List<Integer> sortArray = Arrays.stream(num)
                                        .boxed()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Soretd Array "+sortArray);

        Integer secondHighestNumber = Arrays.stream(num)
                                            .boxed()
                                            .sorted(Comparator.reverseOrder())
                                            .skip(1)
                                            .findFirst()
                                            .get();

        System.out.println("Second Highest Number "+secondHighestNumber);


        //Q3.Find longest String from given Array
        
        String[] strArray= {"java","i am java developer","software engineer","oracle","react"};
        String longestString = Arrays.stream(strArray)
        	  .reduce((w1,w2)->w1.length()>w2.length() ? w1:w2).get();
        
        System.out.println("Longest string given array is :-"+longestString);
        
       //Q4.Find Smallest String from given Array
        
        String[] strArray2= {"mysql","i am java developer","software engineer","oracle","react","sql"};
        String smallestString = Arrays.stream(strArray2)
        	  .reduce((w1,w2)->w1.length()<w2.length() ? w1:w2).get();
        
        System.out.println("Smallest string given array is :-"+smallestString);
        
      //Q5. Find element from aaray who start with 1
        
        int[] nums= {1,13,51,19,45};
        
        List<String> startWith = Arrays.stream(nums)
        	.boxed()
        	.map(s -> s+"")
        	.filter(s->s.startsWith("1"))
        	.collect(Collectors.toList());
        
        
        System.out.println("element Start with 1 "+startWith);

        //Q6 Example of String Join 
        List<String> strArray1=Arrays.asList("1","2","3","4","5");
        String newStr = longestString.join("-", strArray1);
        System.out.println("Example of String Join "+newStr);
        
     //Q6 Skip & limit method use case based example
        
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);
        
        
        int i=0;
       // int j=++i;
       // int k=i++;
        int no=10;
       // System.out.println("+++i pre-operation "+j);

       // System.out.println("i++ post-operation"+k);


        for(int a=i;a<=10;a++)
        {
            System.out.println("before pre- operation "+a);
//            ++a;
//            System.out.println("after pre- operation "+a);
        }


    }
}