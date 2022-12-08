
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CheckAgeEligibility {
	public static void main(String args[]){
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		int id;
		int age;
		for(int i=0;i<6;i++){
			System.out.println("Enter the Id of person:");
			id=sc.nextInt();
			System.out.println("Enter the Age of person:");
			age=sc.nextInt();
			hm.put(id, age);
			
			
			
		}
		sc.close();
		Set<Entry<Integer,Integer>> en=hm.entrySet();
		System.out.println("People eligible for voting are:");
		for(Entry<Integer,Integer> entry:en){
			if(entry.getValue()>18){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
	}

}
