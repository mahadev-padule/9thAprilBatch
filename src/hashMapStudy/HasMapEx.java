package hashMapStudy;

import java.security.Key;
import java.util.HashMap;
import java.util.Map.Entry;

import com.sun.jdi.Value;

public class HasMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(115,"petrol");    
		   map.put(110,"disel");    
		   map.put(100,"CNG");   
		      
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());   
		
		   }

	}

}
