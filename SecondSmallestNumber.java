import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallestNumber{
	public static void main(String args[]){
		List<Integer> li=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elemnts of the list:");
		for(int i=0;i<7;i++){
			int num=sc.nextInt();
			li.add(num);
		}
		
		Collections.sort(li);
		System.out.println("Sorted Elements :");
		
			System.out.println(li);
		
		
	
		System.out.println("The second Smallest element is:"+li.get(1));

	
	}

}
