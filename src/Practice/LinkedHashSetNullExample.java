package Practice;

import java.util.LinkedHashSet;

public class LinkedHashSetNullExample {
    public static void main(String args[])
    {
        /*A LinkedHashSet in Java is a class that extends the HashSet class and provides a collection that maintains the
         order of elements while ensuring uniqueness. It is implemented as a hash table with a linked list running through
         it, which means it has properties of both a HashSet and a LinkedList.
         1.Order Preservation
         2.No Duplicates
         3.Backed by Linked List
         4.Iterating:-Iterating through a LinkedHashSet provides elements in the order they were inserted.
         5.Null Elements
         */
        LinkedHashSet<String> newSet=new LinkedHashSet<>();
        newSet.add(null);
        newSet.add(null);

        System.out.println("Adding More than one Null Value in LinkedHashSet--->"+newSet);

        newSet.add("Shubham");
        newSet.add(null);
        System.out.println("Adding one Null Value in LinkedHashSet--->"+newSet);
    }
}
