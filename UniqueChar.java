package training;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueChar {
	public int charcount(String s){
		String str;
		Scanner sc=new Scanner(System.in);
	    str=sc.nextLine();
		
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			hs.add(str.charAt(i));
			
		}
		return hs.size();
		
		
		
		
		
	}

}
