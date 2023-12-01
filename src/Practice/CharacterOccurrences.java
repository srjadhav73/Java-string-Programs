package Practice;
import java.util.stream.Collectors;
import java.util.*;
public class CharacterOccurrences
{

    public static void main (String args[])
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a string -->");
//        String str=sc.nextLine();
    	String str="Shubham";
    	str.replaceAll("\\s+","");
        
// Using Java8         


    
    	Map<String, Long> result=Arrays
    			                         .stream(str.split(""))
    							          .map(String::toUpperCase)
    							          .collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
    	
    	System.out.println(result);
    			
    
     HashMap<Character,Integer> charCount=new HashMap<Character,Integer>();
     
     char[] strArray=str.toCharArray();
     for(char c : strArray)
     {
    	 if(charCount.containsKey(c))
    	 {
    		 charCount.put(c,charCount.get(c)+1);
    	 }
    	 else
    	 {
    		 charCount.put(c,1);
    		 
    	 }
     }
     for(Map.Entry entry :charCount.entrySet())
     {
    	 System.out.println(entry.getKey()+" " + entry.getValue());
     }
    
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


