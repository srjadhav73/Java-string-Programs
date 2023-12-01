package Practice;

public class Example1 {
    private String name;
    public static void main(String args[])
    {
        String str1="abc";

        String str2=new String("abc");
        str1.concat("bcd");
        System.out.println("String output "+str1);//output :-abc

        System.out.println("String output2 "+(str1==str2));//output :-False
        System.out.println("String output2 "+(str1.equals(str2)));//output :-True

        Example1 e1=new Example1();
        Example1 e2=new Example1();

        System.out.println("String output3 "+(e1==e2));//output :-False
        System.out.println("String output3 "+(e1.equals(e2)));//output :-True



    }

}
