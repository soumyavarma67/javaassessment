
import java.util.HashMap;

import java.util.Scanner;


public class CharacterCountEach {
	
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		
		sc.close();
		String[] arr=S.split("");
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++){
			
			int count=0;
			
			for(int j=0;j<arr.length;j++){
				if(arr[i].equalsIgnoreCase(arr[j]))
					count++;
					
				hm.put(arr[i], count);
			}
		}
		
			System.out.println(hm);
		}

		
		
		
	}


