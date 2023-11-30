package problem_statement8;
import java.util.HashMap;
import java.util.Map;

public class Collection2 {
public static void main(String args[]) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(10, "Virat");
		map.put(11, "Kohli");
		map.put(12, null);
		map.put(13, null);
		
		
		for (Map.Entry<Integer,String> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
 
            
            String value = mapElement.getValue();
 
            
            System.out.println(key + " : " + value);
        }
		
	}


}
