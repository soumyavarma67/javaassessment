import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SchoolMedals {
	public void medal(){
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		int regno;
		int marks;
		
		
		for(int i=0;i<5;i++){
			System.out.println("Enter the regno:");
			
			 regno=sc.nextInt();
			System.out.println("Enter the Marks:");
			marks=sc.nextInt();
			hm.put(regno, marks);
			
		}
		Set<Entry<Integer,Integer>> en=hm.entrySet();
		System.out.println("Marks of the students:");
		for(Entry<Integer,Integer> entry:en){
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		HashMap<Integer, String> hm1=new HashMap<Integer,String>();
		System.out.println("Students eligible for medals are:");
		for(Entry<Integer,Integer> entry:en){
			if(entry.getValue()>=90){
				hm1.put(entry.getKey(), "Gold");
				
			}
			else if(entry.getValue()>=80 && entry.getValue()<90){
				hm1.put(entry.getKey(), "silver");
				
			}
			else if(entry.getValue()>=70 && entry.getValue()<80){
				hm1.put(entry.getKey(), "Bronze");
				
			}
			else{
				
			}
		}
		System.out.println(hm1);
		
		
	}
	public static void main(String args[]){
		SchoolMedals ob=new SchoolMedals();
		ob. medal();
	}

}
