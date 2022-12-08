import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String args[]){
		List<Integer> li=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elemnts of the list:");
		for(int i=0;i<7;i++){
			int num=sc.nextInt();
			li.add(num);
		}
		
		Set<Integer> se=li.stream().collect(Collectors.toSet());
		
		List le=new ArrayList(se);
		Collections.reverse(le);
		System.out.println("after eliminating duplicate values list is and descending the list:");
		System.out.println(le);
		
		
	
		
		
	}

}
