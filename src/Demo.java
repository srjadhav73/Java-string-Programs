
public class Demo {

	
	 String sr="abc";
	static {
		System.out.println("Static block run");
	}
    public  void print()
    {
    	System.out.println("Print method");
    }
    public  void add(Object o)
    {
    	System.out.println("Object "+sr);
    }
    public  void add(Integer a)
    {
    	System.out.println("Object "+sr);
    }
    
	public static void main(String args[])
	{
		String sr="bcd";
		//System.out.println(sr);
		Demo d=new Demo();
		d.add(sr);
		
	}
}
