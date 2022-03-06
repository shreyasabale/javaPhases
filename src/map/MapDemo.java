package map;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"shreya");    
	      hm.put(2,"aarya");    
	      hm.put(3,"sabale");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	             
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"om");  
	      ht.put(5,"bhumi");  
	      ht.put(6,"Jack");  
	      ht.put(7,"Jin");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	 
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Anna");    
	      map.put(9,"smita");    
	      map.put(10,"ravi");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
