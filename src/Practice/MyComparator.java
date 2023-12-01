package Practice;

import java.util.*;
import java.util.stream.Collectors;

//Without Using Lambda Expression
/*class myCom implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        return (a<b)?-1:(a>b)?1:0;
    }
}*/
public class MyComparator {
    public static void main (String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(56);
        list.add(42);
        list.add(2);
        list.add(3);
        list.add(9);
        System.out.println("Before Sorting--"+list);
        Comparator<Integer> c=(a,b)->(a<b)?-1:(a>b)?1:0;
        Collections.sort(list,c);
        System.out.println("After Sorting--"+list);
        //System.out.println("After Sorting--");
       // list.stream().forEach(System.out::println);
        List<Integer> l2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
      //  System.out.println(l2);

    }
}
