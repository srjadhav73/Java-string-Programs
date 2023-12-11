package Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayUsingJava8 {
    public static void main(String args[])
    {
//        int[] arry={1,2,3,2,1,4,4,5,5,99};
//        int[] newArray= Arrays
//                        .stream(arry)
//                        .distinct()
//                        .toArray();
//        System.out.println("Array With Duplicate"+Arrays.toString(arry));
//        System.out.println("Array With without duplicate"+Arrays.toString(newArray));


        String Str="Shubham Jadhav";
       // String newString= removeDuplicateString(Str);
      /**********************Using Java8 ************************/
      String resultStr=Str.chars()
              .distinct()
              .mapToObj(i->String.valueOf((char) i))
                      .collect(Collectors.joining());

        System.out.println("String With Duplicate---->"+Str);
        System.out.println("String With without duplicate--->"+resultStr);

    }

}
