import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SquaresOfNumbers {
	public static void main(String args[]){
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Set<Entry<Integer,Integer>> s=hm.entrySet();
		
			for(int i=1;i<10;i++)
				hm.put(i, i*i);
				
			for(Entry<Integer,Integer> entry:s){
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
		
		
	}
	
	


