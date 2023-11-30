package problem_statement8;
import java.util.HashSet;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {
       Set<String> set = new HashSet<String>();
		
		set.add("Virat");
		set.add("Rohit");
		set.add("Gill");
		set.add("Rahul");
		
		for( String i:set) {
			
			System.out.println(i);
			
		}

	}

}
